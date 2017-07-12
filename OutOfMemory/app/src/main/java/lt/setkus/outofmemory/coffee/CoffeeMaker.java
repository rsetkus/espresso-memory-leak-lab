package lt.setkus.outofmemory.coffee;

import android.util.Log;

public class CoffeeMaker {

    private final char COFFEE_BEAN = 0x17D9;

    private static final String TAG = "CoffeeMaker";

    private static final int MAX_LITERS = 5;

    private final Heater heater;
    private final Pump pump;

    public CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public int brew() {
        int liters = 0;

        heater.on();
        while (heater.isHot()) {
            if (MAX_LITERS == liters) {
                heater.off();
            }

            pump.pump();
            liters++;

            Log.d(TAG, "java in " + COFFEE_BEAN + " -> java out ~~~ [_]P");
            Log.d(TAG, liters + " liters leaked");
        }

        return liters;
    }
}
