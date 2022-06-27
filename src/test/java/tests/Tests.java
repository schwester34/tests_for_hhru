package tests;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;


@Tag("vacancy")
public class Tests extends TestBase {
    SelenideElement vacancy = $(".vacancy-serp__vacancy-title"),
            city = $(".bloko-text"),
            skill = $(".vacancy-serp-item__info"),  //*[@id="a11y-main-content"]
            form = $(".bloko-form-item"),
            attribute = $(byAttribute("data-qa", "account-signup-email")),
            ok = $(".signup-submit"),
            checkup = $(".bloko-form-error");
    @Test
    @DisplayName("Positive tests")
    void hhTest01() {
        step("open the link", () -> {
            open("/vacancy?text=Qa+engineer+java&from=suggest_post&salary=&clusters=true&area=3&ored_clusters=true&enable_snippets=true");
        });

        step("check the correspondence of the job title to the expectation: Middle QA Engineer", () -> {
            vacancy.shouldHave(text("Middle QA Engineer"));
        });

        step("check the compliance of the city with the vacancy: Екатеринбург", () -> {
            city.shouldHave(text("Екатеринбург"));
        });
        step("checking compliance in key skills Java", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Java"));
        });
        step("checking for an error notification when entering the phone incorrectly", () -> {
            form.click();
            attribute.setValue("12345678987654321");
            ok.click();
            checkup.shouldHave(text("Пожалуйста, укажите email или телефон"));
        });
    }

    @Test
    @DisplayName("Negative test")
    void hhTest02() {
        step("open the vacancies link", () -> {
            open("/vacancy?text=Qa+engineer+java&from=suggest_post&salary=&clusters=true&area=3&ored_clusters=true&enable_snippets=true");
        });
        step("checking compliance in key skills Python", () -> {
            skill.scrollTo();
            skill.shouldHave(text("Python"));
        });
    }

}
