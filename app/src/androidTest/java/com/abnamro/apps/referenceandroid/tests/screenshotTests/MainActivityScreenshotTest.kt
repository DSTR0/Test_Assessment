package com.abnamro.apps.referenceandroid.tests.screenshotTests

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.MainActivity
import com.abnamro.apps.referenceandroid.utils.BaseTest
import com.karumi.shot.ActivityScenarioUtils.waitForActivity
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityScreenshotTest : BaseTest() {

    @Test
    fun mainActivityIsShown() {
        val activity = ActivityScenario.launch(MainActivity::class.java).waitForActivity()
        compareScreenshot(activity = activity, name = getTestName())
    }
}