package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


@Tag("vacancy")
public class Tests extends TestBase {
    SelenideElement vacancy = $(".HH-MainContent"),
            address = $("[data-qa='vacancy-view-raw-address']"),
            skill = $(".bloko-tag-list");


    @Test
    @DisplayName("Positive tests")
    void hhTest01() {
        step("open the link", () -> open("/vacancy/51857862?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20engineer%20java"));

        step("check the correspondence of the job title to the expectation: Middle QA Engineer", () -> {
            vacancy.shouldHave(text("Middle QA Engineer"));
        });

        step("check the compliance of the address with the vacancy: Екатеринбург, улица Ткачей, 23", () -> {
            address.shouldHave(text("Екатеринбург, улица Ткачей, 23"));
        });
        step("checking compliance in key skills Java", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Java"));
        });
    }

    @Test
    @DisplayName("Negative test")
    void hhTest02() {
        step("open the vacancies link", () -> {
            open("/vacancy/51857862?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20engineer%20java");
        });
        step("checking compliance in key skills Jira", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Jira"));
        });
    }
    @Test
    @DisplayName("Negative test")
    void hhTest03() {
        step("open the vacancies link", () -> {
            open("/vacancy/51857862?from=vacancy_search_list&hhtmFrom=vacancy_search_list&query=QA%20engineer%20java");
        });
        step("checking compliance in key skills Selenide", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Selenide"));
        });
    }

}
