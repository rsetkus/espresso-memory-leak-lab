package lt.setkus.outofmemory;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import lt.setkus.outofmemory.coffee.CoffeeMaker;
import lt.setkus.outofmemory.di.ActivityComponent;

public class MainActivity extends BaseActivity {

    static String TAG = MainActivity.class.getSimpleName();

    private TextView coffeeResult;

    static int createCounter;
    int myNumber;

    @Inject
    CoffeeMaker coffeeMaker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coffeeResult = (TextView) findViewById(R.id.coffee_result);
        coffeeResult.setText(String.format("%d liters brewed", coffeeMaker.brew()));

        myNumber = createCounter++;
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
