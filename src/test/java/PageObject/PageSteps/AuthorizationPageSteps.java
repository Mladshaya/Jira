package PageObject.PageSteps;

import io.qameta.allure.Step;
import static PageObject.PageElements.AuthorizationPageElements.*;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.open;
import static utils.Configuration.getConfigurationValue;

public class AuthorizationPageSteps {

    @Step
    public static void openUrl(String url) {
        open(url);
    }

    @Step
    public static void authorization(String login) {
        loginLane.shouldBe(visible).sendKeys(getConfigurationValue("login"));
        passwordLane.sendKeys(getConfigurationValue("password"));
        buttonLogin.shouldBe(enabled).click();
    }
}
