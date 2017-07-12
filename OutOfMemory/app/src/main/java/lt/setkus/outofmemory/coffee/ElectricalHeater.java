package lt.setkus.outofmemory.coffee;

import android.util.Log;

public class ElectricalHeater implements Heater {

    private static final String TAG = "ElectricalHeater";

    private boolean isHeating;

    @Override
    public void on() {
        Log.d(TAG, "===== Heating =====");
        isHeating = true;

    }

    @Override
    public void off() {
        Log.d(TAG, "===== Getting cold =====");
        isHeating = false;
    }

    @Override
    public boolean isHot() {
        return isHeating;
    }
}
