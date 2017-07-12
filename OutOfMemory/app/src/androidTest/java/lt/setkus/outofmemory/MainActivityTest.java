package lt.setkus.outofmemory;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitor;
import android.support.test.runner.lifecycle.ActivityLifecycleMonitorRegistry;
import android.support.test.runner.lifecycle.Stage;
import android.util.Log;

import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import lt.setkus.outofmemory.coffee.ElectricalHeater;
import lt.setkus.outofmemory.coffee.Heater;
import lt.setkus.outofmemory.di.ApplicationModule;
import lt.setkus.outofmemory.espresso.BaseActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.mockito.Mockito.mock;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private ActivityLifecycleMonitor activityLifecycleMonitor = ActivityLifecycleMonitorRegistry.getInstance();
    private Context context = InstrumentationRegistry.getTargetContext();

    private static String TAG = MainActivity.class.getSimpleName();

    private ElectricalHeater electricalHeater = mock(ElectricalHeater.class);

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new BaseActivityTestRule(MainActivity.class, true) {
        @Override
        protected ApplicationModule getApplicationModule() {
            OutOfMemoryApplication application = (OutOfMemoryApplication) InstrumentationRegistry.getTargetContext().getApplicationContext();
            return new ApplicationModule(application) {
                @Override
                public Heater provideHeater() {
                    return electricalHeater;
                }
            };
        }
    };

    @After
    public void tearDown() {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            @Override
            public void run() {
                final List<Activity> activities = new ArrayList();

                for (final Stage stage : EnumSet.range(Stage.CREATED, Stage.STOPPED)) {
                    activities.addAll(activityLifecycleMonitor.getActivitiesInStage(stage));
                }

                Log.d(TAG, String.format("%d of %d is active", activities.size(), TestUtil.getNumberOfActivitiesOnMemory(context)));
            }
        });
    }


    private void doTest() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    
    @Test
    public void testCase1() {
        doTest();
    }

    @Test
    public void testCase2() {
        doTest();
    }

    @Test
    public void testCase3() {
        doTest();
    }

    @Test
    public void testCase4() {
        doTest();
    }

    @Test
    public void testCase5() {
        doTest();
    }

    @Test
    public void testCase6() {
        doTest();
    }

    @Test
    public void testCase7() {
        doTest();
    }

    @Test
    public void testCase8() {
        doTest();
    }

    @Test
    public void testCase9() {
        doTest();
    }

    @Test
    public void testCase10() {
        doTest();
    }

    @Test
    public void testCase11() {
        doTest();
    }

    @Test
    public void testCase12() {
        doTest();
    }

    @Test
    public void testCase13() {
        doTest();
    }

    @Test
    public void testCase14() {
        doTest();
    }

    @Test
    public void testCase15() {
        doTest();
    }

    @Test
    public void testCase16() {
        doTest();
    }

    @Test
    public void testCase17() {
        doTest();
    }

    @Test
    public void testCase18() {
        doTest();
    }

    @Test
    public void testCase19() {
        doTest();
    }

    @Test
    public void testCase20() {
        doTest();
    }

    @Test
    public void testCase21() {
        doTest();
    }

    @Test
    public void testCase22() {
        doTest();
    }

    @Test
    public void testCase23() {
        doTest();
    }

    @Test
    public void testCase24() {
        doTest();
    }

    @Test
    public void testCase25() {
        doTest();
    }

    @Test
    public void testCase26() {
        doTest();
    }

    @Test
    public void testCase27() {
        doTest();
    }

    @Test
    public void testCase28() {
        doTest();
    }

    @Test
    public void testCase29() {
        doTest();
    }

    @Test
    public void testCase30() {
        doTest();
    }
}