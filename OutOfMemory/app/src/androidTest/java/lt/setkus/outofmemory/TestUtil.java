package lt.setkus.outofmemory;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.util.Log;

public class TestUtil {

    private static final String TAG = "TestUtil";

    public static int getNumberOfActivitiesOnMemory(Context context) {
        int numberOfActivities = 0;
        try {
            ActivityInfo[] activities = context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_ACTIVITIES).activities;
            numberOfActivities = activities != null ? activities.length : 0;
        } catch (PackageManager.NameNotFoundException e) {
            Log.d(TAG, e.getMessage());
        }

        return numberOfActivities;
    }

    private TestUtil() {}
}
