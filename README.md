# Test assignment

### How to run screenshot tests

##### Recording tests

You can record your screenshot tests executing this command:

```shell
./gradlew <Flavor><BuildType>ExecuteScreenshotTests -Precord
```

or

```shell
./gradlew executeScreenshotTests -Precord
```

This will execute all your integration tests and it will pull all the generated screenshots into your repository so you can easily add them to the version control system.

Also, I can recommend adding the following parameter, to run only one particular screenshot test, instead of all tests:

```shell
-Pandroid.testInstrumentationRunnerArguments.class=com.abnamro.apps.referenceandroid.tests.screenshotTests.MainActivityScreenshotTest
```

##### Executing tests

Once you have a bunch of screenshot tests recorded you can easily verify if the behaviour of your app is the correct one executing this command:

```shell
./gradlew <Flavor><BuildType>ExecuteScreenshotTests
```

or

```shell
./gradlew executeScreenshotTests
```

Also, I can recommend adding the following parameter, to run only one particular screenshot test, instead of all tests:

```shell
-Pandroid.testInstrumentationRunnerArguments.class=com.abnamro.apps.referenceandroid.tests.screenshotTests.MainActivityScreenshotTest
```

### Test cases

| Test case name | Checking that the "Hello World" title is visible |
| ----------- | ----------- |
| testId | 001 |
| Step | Description |
| 1 | Open the app |
| 2 | Check "Hello World" title |
| Expected result | The "Hello World" title is visible |

| Test case name | Checking that the "Mail/SMS" button is visible |
| ----------- | ----------- |
| testId | 002 |
| Step | Description |
| 1 | Open the app |
| 2 | Check "Mail/SMS" button |
| Expected result | The "Mail/SMS" button is visible |

| Test case name | Checking that the toolbar/action bar is visible |
| ----------- | ----------- |
| testId | 003 |
| Step | Description |
| 1 | Open the app |
| 2 | Check toolbar/action bar |
| Expected result | The toolbar/action bar is visible and text is equal to the app name |

| Test case name | Checking that the "three vertical dots" menu is visible |
| ----------- | ----------- |
| testId | 004 |
| Step | Description |
| 1 | Open the app |
| 2 | Check "three vertical dots" menu  |
| Expected result | The "three vertical dots" menu is visible |

| Test case name | Checking that the "snackbar" after click on mail button is shown |
| ----------- | ----------- |
| testId | 005 |
| Step | Description |
| 1 | Open the app |
| 2 | Click on "Mail/SMS" button |
| Expected result | The snackbar with text "Replace with your own action" is visible |

| Test case name | Checking that the "three vertical dots" menu contains "settings" |
| ----------- | ----------- |
| testId | 006 |
| Step | Description |
| 1 | Open the app |
| 2 | Click on "three vertical dots" menu |
| Expected result | The "three vertical dots" menu unwrap/dropdown have "Settings" option |

| Test case name | Checking that the "snackbar" after some time is disappeared |  
| ----------- | ----------- |  
| testId | 007 |  
| Step | Description |  
| 1 | Open the app |  
| 2 | Click on "Mail/SMS" button |  
| 3 | Wait around 3.5 seconds |  
| Expected result | The snackbar disappear |  

### Accessibility issues

1. During the execution of the "checkSettingsDisplayed" test, one accessibility error was found: the "three vertical dots" menu view falls below the minimum recommended size for touch targets. The minimum touch target size is 48x48dp. The actual size is 40.0x48.0dp (Google Pixel 2(API 29, Resolution 1080x1920, dp 412x732), screen density is 2.6).
2. During the execution of the "checkSnackbarDisplayed" test, one accessibility error was found: "Mail/SMS" button view is missing speakable text needed for a screen reader (Google Pixel 2(API 29, Resolution 1080x1920, dp 412x732), screen density is 2.6).


