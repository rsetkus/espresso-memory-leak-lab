package lt.setkus.outofmemory.coffee;

import android.util.Log;

public class Thermosiphon implements Pump {

    private static final String TAG = "Thermosiphon";

    private final Heater heater;

    public Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override
    public void pump() {
        if (heater.isHot()) {
            Log.d(TAG, "( )( )===>> pump pump pump... (. )( .)");
        } else {
            Log.d(TAG, "Turn me on babe!");
        }
    }
}
