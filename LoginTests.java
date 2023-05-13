package Tests;
import org.testng.annotations.Test;
import static Utils.ExtentReports.ExtentTestManager.startTest;
public class LoginTests<Method> extends BaseTest {
    @Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword(Method method) {
        //ExtentReports Description
        startTest(method.toString(), "Invalid Login Scenario with invalid username and password.");
        homePage
                .goTogoogle()
                .goToLoginPage()
                .loginTogoogle("ksaranya1411@gmail.com", "Sricharan@2011")
                .verifyLoginPassword("please enter a valid password.");
    }
    @Test(priority = 1, description = "Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword(Method method) {
        //ExtentReports Description

        startTest(method.toString(), "Invalid Login Scenario with empty username and password.");
        homePage
                .goTogoogle()
                .goToLoginPage()
                .loginTogoogle("ksaranya1411@gmail.com", "Sricharan@2011")
                .verifyLoginUserName("please enter a valid email address..")
                .verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
    }
}