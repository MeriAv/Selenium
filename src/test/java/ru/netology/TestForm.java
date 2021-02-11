package ru.netology;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestForm {


    @Test
    void shouldValidTest(){
        open("http://localhost:9999");
        $("[type=text]").setValue("Василий");
        $("[type=tel]").setValue("+79270000000");
        $(".checkbox__box").click();
        $("button.button").click();
        $("[data-test-id='order-success']")
        .shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));

    }

}