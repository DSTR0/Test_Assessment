package com.abnamro.apps.referenceandroid.utils

import android.os.Build
import org.junit.rules.TestName
import androidx.test.espresso.accessibility.AccessibilityChecks
import androidx.test.rule.ActivityTestRule
import com.abnamro.apps.referenceandroid.MainActivity
import com.karumi.shot.ScreenshotTest
import org.junit.BeforeClass
import org.junit.Rule

abstract class BaseTest : ScreenshotTest {

    @get:Rule
    var testName: TestName = TestName()

    @get:Rule
    val activityRule = ActivityTestRule(MainActivity::class.java)

    fun getTestName(): String {
        val apiVersion = "api${Build.VERSION.SDK_INT}"
        val finalTestName = testName.methodName + "_" + apiVersion
        return finalTestName
    }

    companion object {
        @BeforeClass
        @JvmStatic
        fun enableAccessibilityChecks() {
            AccessibilityChecks.enable()
        }
    }
}