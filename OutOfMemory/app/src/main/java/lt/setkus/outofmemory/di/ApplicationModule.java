package lt.setkus.outofmemory.di;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import lt.setkus.outofmemory.OutOfMemoryApplication;
import lt.setkus.outofmemory.coffee.ElectricalHeater;
import lt.setkus.outofmemory.coffee.Heater;
import lt.setkus.outofmemory.coffee.Pump;
import lt.setkus.outofmemory.coffee.Thermosiphon;

@Module
public class ApplicationModule {

    private final OutOfMemoryApplication application;

    public ApplicationModule(OutOfMemoryApplication application) {
        this.application = application;
    }

    @Singleton
    @Provides
    public Heater provideHeater() {
        return new ElectricalHeater();
    }

    @Singleton
    @Provides
    public Pump providePump(Heater heater) {
        return new Thermosiphon(heater);
    }
}
