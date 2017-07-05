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

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    private static String TAG = MainActivity.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule(MainActivity.class, true);

//    @After
//    public void tearDown() {
//        Log.d(TAG, "tearDown");
//        ActivityFinisher.finishOpenActivities();
//    }

    @Test
    public void testCase1() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase2() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase3() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase4() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase5() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase6() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase7() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase8() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase9() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase10() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase11() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase12() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase13() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase14() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase15() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase16() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase17() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase18() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase19() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase20() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase21() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase22() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase23() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase24() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase25() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase26() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase27() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase28() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase29() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

    @Test
    public void testCase30() {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }
}