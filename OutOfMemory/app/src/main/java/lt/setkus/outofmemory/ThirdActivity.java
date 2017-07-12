package lt.setkus.outofmemory;

import android.os.Bundle;
import android.util.Log;

import lt.setkus.outofmemory.di.ActivityComponent;

public class ThirdActivity extends BaseActivity {

    static int thirdActivityCounter;
    int myNumber;

    static String TAG = ThirdActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        myNumber = thirdActivityCounter++;
    }

    @Override
    protected void injectComponent(ActivityComponent component) {
        component.inject(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume " + myNumber);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause " + myNumber);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy " + myNumber);
    }
}
