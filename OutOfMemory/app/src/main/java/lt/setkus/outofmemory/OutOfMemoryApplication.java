package lt.setkus.outofmemory;

import android.app.Application;

import lt.setkus.outofmemory.di.ApplicationComponent;
import lt.setkus.outofmemory.di.ApplicationModule;
import lt.setkus.outofmemory.di.DaggerApplicationComponent;

public class OutOfMemoryApplication extends Application {

    private ApplicationComponent applicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
    }

    public void setApplicationComponent(ApplicationComponent applicationComponent) {
        this.applicationComponent = applicationComponent;
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
