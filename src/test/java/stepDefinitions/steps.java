package stepDefinitions;

import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;

public class steps {
    int a;
    int b;
    double result;

    @Дано("^два числа (.*) и (.*)$")
    public void setup(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @И("^находим сумму этих чисел и выводим результат$")
    public void summ() {
        this.result = a + b;
        System.out.println(result);
    }

    @И("^их разность равна$")
    public void don() {
        this.result = a - b;
        System.out.println(result);
    }

    @И("^находим произведение этих чисел и выводим результат$")
    public void pon() {
        this.result = a * b;
        System.out.println(result);
    }

    @И("^частное этих чисел равно$")
    public void qon() {
        this.result = a / b;
        System.out.println(result);
    }
}
