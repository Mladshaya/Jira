package Hooks;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;



public class WebHooks {

    @BeforeAll
    public static void setDriverFromProps() {
        Configuration.startMaximized = true;
    }


    @AfterEach
   public void driverClose() {
   WebDriverRunner.closeWebDriver();
   }
}
