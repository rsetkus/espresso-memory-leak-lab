package lt.setkus.outofmemory.espresso;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import lt.setkus.outofmemory.BaseActivity;
import lt.setkus.outofmemory.OutOfMemoryApplication;
import lt.setkus.outofmemory.di.ApplicationComponent;
import lt.setkus.outofmemory.di.ApplicationModule;
import lt.setkus.outofmemory.di.DaggerApplicationComponent;

public abstract class BaseActivityTestRule<T extends BaseActivity> extends ActivityTestRule<T> {

    public BaseActivityTestRule(Class<T> activityClass, boolean launchActivity) {
        super(activityClass, false, launchActivity);
    }

    @Override
    protected void beforeActivityLaunched() {
        OutOfMemoryApplication app = (OutOfMemoryApplication) InstrumentationRegistry.getInstrumentation().getTargetContext().getApplicationContext();
        ApplicationComponent appComponent = DaggerApplicationComponent.builder()
            .applicationModule(getApplicationModule())
            .build();

        app.setApplicationComponent(appComponent);
    }

    protected abstract ApplicationModule getApplicationModule();
}
