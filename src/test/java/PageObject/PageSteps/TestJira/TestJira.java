package PageObject.PageSteps.TestJira;

import Hooks.WebHooks;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;

import static PageObject.PageSteps.AuthorizationPageSteps.authorization;
import static PageObject.PageSteps.AuthorizationPageSteps.openUrl;
import static PageObject.PageSteps.CreateTaskSteps.*;
import static PageObject.PageSteps.ProjectPageSteps.*;
import static utils.Configuration.getConfigurationValue;

public class TestJira extends WebHooks {
    @Test
    @Tag("TestSet1")
    @Tag("1")
    @DisplayName("ТК 1. Авторизация")
    public void Test_1() {
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
    }

    @Test
    @Tag("TestSet1")
    @Tag("2")
    @DisplayName("ТК 2. Открытие проекта")
    public void Test_2() {
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        openProject();
            }

    @Test
    @Tag("TestSet1")
    @Tag("3")
    @DisplayName("ТК 3. Нахождение количества заведенных задач в проекте")
    public void Test_3(){
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        openProject();
        findTasksAmount();
    }

    @Test
    @Tag("TestSet1")
    @Tag("4")
    @DisplayName("ТК 4. Проверка статуса и версии задачи")
    public void Test_4(){
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        openProject();
        findTasksAmount();
        searchTask();
        checkVersion();
        checkStatus();
    }

    @Test
    @Tag("TestSet1")
    @Tag("5")
    @DisplayName("ТК 5. Заведение дефекта и проверка смены статусов")
    public void  Test_5(){
        openUrl(getConfigurationValue("jiraUrl"));
        authorization();
        openProject();
        findTasksAmount();
        searchTask();
        checkVersion();
        checkStatus();
        createTask();
        clickToInwork();
        checkInworkStatus();
        changeToDoneStatus();
        checkDoneStatus();
    }
}

