package com.abnamro.apps.referenceandroid.tests

import androidx.test.espresso.IdlingRegistry
import com.abnamro.apps.referenceandroid.pages.MainPage
import com.abnamro.apps.referenceandroid.test.EspressoIdlingResources
import com.abnamro.apps.referenceandroid.utils.BaseTest
import org.junit.After
import org.junit.Before
import org.junit.Test

class MainActivitySnackbarTest: BaseTest() {

    @Before
    fun registerIdlingResource() {
        IdlingRegistry.getInstance().register(EspressoIdlingResources.countingIdlingResource)
    }

    @After
    fun unregisterIdlingResource() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResources.countingIdlingResource)
    }

    @Test //testId: 007
    fun checkSnackbarDisappeared(){
        MainPage().assertMailButtonClickable()
        MainPage().clickMailButton()
        MainPage().assertSnackBarNotDisplayed()
    }
}