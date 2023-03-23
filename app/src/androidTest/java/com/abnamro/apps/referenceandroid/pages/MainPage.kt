package com.abnamro.apps.referenceandroid.pages

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.abnamro.apps.referenceandroid.R

class MainPage {

    private val helloLabel = onView(withText("Hello World!"))
    private val mailButton = onView(withId(R.id.fab))
    private val snackbar = onView(withText("Replace with your own action"))
    private val settings = onView(withText(R.string.action_settings))
    private val toolbar = onView(withText(R.string.app_name))
    private val threeDotsMenu = onView(withContentDescription("More options"))

    fun assertHelloLabelDisplayed() {
        helloLabel.check(matches(isDisplayed()))
    }

    fun assertThreeDotsMenuDisplayed() {
        threeDotsMenu.check(matches(isDisplayed()))
    }

    fun assertThreeDotsMenuClickable() {
        threeDotsMenu.check(matches(isClickable()))
    }

    fun clickThreeDotsMenu() {
        threeDotsMenu.perform(ViewActions.click())
    }

    fun assertMailButtonDisplayed() {
        mailButton.check(matches(isDisplayed()))
    }

    fun assertMailButtonClickable() {
        mailButton.check(matches(isClickable()))
    }

    fun clickMailButton() {
        mailButton.perform(ViewActions.click())
    }

    fun assertToolbarDisplayed() {
        toolbar.check(matches(isDisplayed()))
    }

    fun assertSettingsButtonDisplayed() {
        settings.check(matches(isDisplayed()))
    }

    fun assertSnackBarDisplayed() {
        snackbar.check(matches(isDisplayed()))
    }

    fun assertSnackBarNotDisplayed() {
        snackbar.check(doesNotExist())
    }

}