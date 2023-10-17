package com.example.messengerapp;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.Rule;
import androidx.test.rule.ActivityTestRule;

import static org.junit.Assert.*;



/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule = new ActiveTestRule()<>(MainActivity.class);
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.example.messengerapp", appContext.getPackageName());
    }

    @Test
    public void clickButtonBtnSend(){
        onView(withId(R.id.btnSend)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void clickBottomHome(){
        onView(withId(R.id.navigation_home)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void clickButtonDashboard(){
        onView(withId(R.id.navigation_dashboard)).perform(click()).check(matches(isDisplayed()));
    }

    @Test
    public void clickButtonNotification(){
        onView(withId(R.id.navigation_notification)).perform(click()).check(matches(isDisplayed()));
    }
}