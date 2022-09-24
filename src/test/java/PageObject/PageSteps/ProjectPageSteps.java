package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static PageObject.PageElements.ProjectPageElements.*;
import static com.codeborne.selenide.Condition.*;

public class ProjectPageSteps {

    @Step
    public static void openProject() {
        buttonProject.shouldBe(Condition.enabled).click();
        buttonAllProject.shouldBe(Condition.visible).click();
        searchProject.sendKeys("Test");
        searchProject.pressEnter();
        linkProject.shouldHave(Condition.exactText("Test")).click();
            }

    @Step
    public static void openTasks() {
        tasksList.shouldBe(Condition.enabled).click();
    }

    @Step
    public static void findTasksAmount() {
        String text = tasksAmount.getText();
        String amount = text.substring(text.lastIndexOf("из") + 2, text.length());
        System.out.println(amount);
    }

    @Step
    public static void searchTask() {
        taskFilter.shouldBe(Condition.enabled).click();
        buttonAllTasks.click();
        searchField.shouldBe(Condition.empty).sendKeys("TestSelenium_bug");
        searchField.pressEnter();
    }

    @Step
    public static void checkVersion() {
        //taskVersion.shouldHave(text("Version 2.0"));
        String version = taskVersion.getText();
        System.out.println("Version: " + version);


    }

    @Step
    public static void checkStatus() {
        taskStatus.shouldBe(visible);
        String status = taskStatus.getText();
        System.out.println("Status: " + status);
    }
}

