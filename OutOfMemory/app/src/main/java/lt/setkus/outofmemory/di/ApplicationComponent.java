package lt.setkus.outofmemory.di;

import javax.inject.Singleton;

import dagger.Component;
import lt.setkus.outofmemory.coffee.Heater;
import lt.setkus.outofmemory.coffee.Pump;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    Heater getHeater();
    Pump getPump();
}
