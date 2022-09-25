package PageObject.PageSteps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import java.time.Duration;

import static PageObject.PageElements.CreateTaskElements.*;
import static com.codeborne.selenide.Condition.visible;

public class CreateTaskSteps {

    @Step
    public static void createTask() {
        buttonCreate.click();
        issueTypeField.click();
        issueTypeField.sendKeys("Ошибка");
        //issueTypeField.pressEnter();
        summaryField.shouldBe(visible, Duration.ofSeconds(60)).click();
        summaryField.setValue("Bug test");
        buttonText.click();
        descriptionField.click();
        descriptionField.setValue("Bug description. Actual result. Expected result");
        priorityField.click();
        priorityField.sendKeys("High");
        //priorityField.pressEnter();
        assigneeField.click();
        assigneeField.sendKeys("shustova");
        //assigneeField.pressEnter();
        buttonCreateTask.click();
        linkTask.shouldBe(visible).click();
    }

    public static void clickToInwork() {
        buttonInwork.click();
    }

    public static void checkInworkStatus() {
        statusFieldInwork.shouldHave(Condition.text("В работе"));
    }

    public static void changeToDoneStatus() {
        dropdownStatusTask.click();
        doneStatusTask.click();
    }

    public static void checkDoneStatus() {
        statusFieldDone.shouldHave(Condition.text("Готово"));
    }
}
