package lt.setkus.outofmemory.di;

import dagger.Module;
import dagger.Provides;
import lt.setkus.outofmemory.BaseActivity;
import lt.setkus.outofmemory.coffee.CoffeeMaker;
import lt.setkus.outofmemory.coffee.Heater;
import lt.setkus.outofmemory.coffee.Pump;

@Module
public class ActivityModule {

    private final BaseActivity activity;

    public ActivityModule(BaseActivity activity) {
        this.activity = activity;
    }

    @Provides
    public CoffeeMaker provideCoffeeMaker(Heater heater, Pump pump) {
        return new CoffeeMaker(heater, pump);
    }
}
