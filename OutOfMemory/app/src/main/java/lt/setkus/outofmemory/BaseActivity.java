package lt.setkus.outofmemory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import lt.setkus.outofmemory.di.ActivityComponent;
import lt.setkus.outofmemory.di.ActivityModule;
import lt.setkus.outofmemory.di.ApplicationComponent;
import lt.setkus.outofmemory.di.DaggerActivityComponent;

public abstract class BaseActivity extends AppCompatActivity {
    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ApplicationComponent applicationComponent = ((OutOfMemoryApplication) getApplicationContext()).getApplicationComponent();
        activityComponent = DaggerActivityComponent.builder()
            .applicationComponent(applicationComponent)
            .activityModule(new ActivityModule(this))
            .build();

        injectComponent(activityComponent);
    }

    public ActivityComponent getComponent() {
        return activityComponent;
    }

    protected abstract void injectComponent(ActivityComponent component);
}
