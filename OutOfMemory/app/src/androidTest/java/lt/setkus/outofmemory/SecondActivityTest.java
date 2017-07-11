package lt.setkus.outofmemory;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


/**
 * Created by james on 11/07/17.
 */
@RunWith(AndroidJUnit4.class)
public class SecondActivityTest {

        private static String TAG = SecondActivity.class.getSimpleName();

        @Rule
        public ActivityTestRule<SecondActivity> secondActivityTestRule = new ActivityTestRule(SecondActivity.class, true);

//    @After
//    public void tearDown() {
//        Log.d(TAG, "tearDown");
//        ActivityFinisher.finishOpenActivities();
//    }

        @Test
        public void testCase1() {
            doTest();
        }

        @Test
        public void testCase2() {
            doTest();
        }

    private void doTest() {
        onView(withText("SECOND ACTIVITY!")).check(matches(isDisplayed()));
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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