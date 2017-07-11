package lt.setkus.outofmemory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by james on 11/07/17.
 */
public class SecondActivity extends AppCompatActivity {

    static int secondActivityCounter;
    int myNumber;

    static String TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        myNumber = secondActivityCounter++;
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
