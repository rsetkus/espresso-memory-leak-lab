package lt.setkus.outofmemory.di;

import dagger.Component;
import lt.setkus.outofmemory.BaseActivity;
import lt.setkus.outofmemory.MainActivity;
import lt.setkus.outofmemory.SecondActivity;
import lt.setkus.outofmemory.ThirdActivity;

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(BaseActivity baseActivity);
    void inject(MainActivity baseActivity);
    void inject(SecondActivity baseActivity);
    void inject(ThirdActivity baseActivity);
}
