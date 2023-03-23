package com.abnamro.apps.referenceandroid.tests

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.abnamro.apps.referenceandroid.pages.MainPage
import com.abnamro.apps.referenceandroid.utils.BaseTest
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest : BaseTest() {

    //VISIBILITY TESTS

    @Test //testId: 001
    fun checkHelloWorldVisible() {
        MainPage().assertHelloLabelDisplayed()
    }

    @Test //testId: 002
    fun checkMailButtonVisible() {
        MainPage().assertMailButtonDisplayed()
    }

    @Test //testId: 003
    fun checkToolbarVisible() {
        MainPage().assertToolbarDisplayed()
    }

    @Test //testId: 004
    fun checkThreeDotsMenuVisible() {
        MainPage().assertThreeDotsMenuDisplayed()
    }

    //INTERACTION TESTS

    @Test //testId: 005
    fun checkSnackbarDisplayed() {
        MainPage().assertMailButtonClickable()
        MainPage().clickMailButton()
        MainPage().assertSnackBarDisplayed()
    }

    @Test //testId: 006
    fun checkSettingsDisplayed() {
        MainPage().assertThreeDotsMenuClickable()
        MainPage().clickThreeDotsMenu()
        MainPage().assertSettingsButtonDisplayed()
    }
}
