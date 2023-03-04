# Appium Basic Google Calculator Automation
### A basic calculator app is automated by testing its basic functionalites using Appium on an emulated device powered by Android Studio.
Here the following tasks are done:
- A basic Calculator app extracted from [Calculator App](https://play.google.com/store/apps/details?id=com.google.android.calculator) is automated by extracting its apk.
- Basic operations like add,subtract,multiplication and divide functionality is checked whether it is giving correct result or not using Appium.

### Technology: </br>
- Tool: Selenium Webdriver
- IDE: Intellij, Android Studio
- Build tool: Gradle
- Language: Java
- Test_Runner: Appium

## Based on scenerio:
- Sum of 2 numbers (9+5=14)
- Subtraction of 2 numbers (8-3=5)
- multiplied of Result of Sum and Subtraction (14*5=70)
- Divided the result of multiplication with 10 (70/10=7)
- Solved this series (100+200-100*2/5)

### Prerequisites</br>
- Install Android Studio latest version
- Install Appium 1.17.1
- Install jdk 8 or any LTS version

## How to run this project:

- Clone this project
- Open Android Studio and Open the APK file:
- Set required configuration 
- Hit this command in cmd for checking the connectivity with emulator : ``adb devices``
- Open Appium Server with following command: ```appium -p 4723```
- Open Appium Inspector
- Set desired capabilites in json format:
``` 
 {
 "appium:deviceName": "emulator",
  "appium:uuid": "emulator-5554",
  "platformName": "Android",
  "appium:platformVersion": "11",
  "appium:appPackage": "com.google.android.calculator",
  "appium:appActivity": "com.android.calculator2.Calculator",
  "appium:app": "D:\\RTSDET\\APK\\calculator.apk"
  }
```
- Open Intellij Idea
- Hit the following command into the terminal: ```gradle clean test```

- The following report is generated:

![Screenshot 2023-03-02 033433](https://user-images.githubusercontent.com/58912515/222275875-75e3a678-5668-43b7-a8b0-68521ac3c34a.png)

- After automation to view allure report , give the following commands:
 ```
allure generate allure-results --clean -o allure-report
allure serve allure-results
 ```
**Here is the Allure report overview:**
![Screenshot 2023-03-02 230727](https://user-images.githubusercontent.com/58912515/222501686-21cae416-a6b7-42ae-b611-30cafdb8c451.png)
![Screenshot 2023-03-02 231125](https://user-images.githubusercontent.com/58912515/222501866-7fa1f8ce-f001-4035-bace-a3f11ac123aa.png)

### Automation Video Output:

https://user-images.githubusercontent.com/58912515/222796381-66fea734-c801-4eb7-9d62-a3bebb6400b4.mp4










