package co.edu.udea.certificacion.calidad.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import java.util.Random;

public class RandomValues implements Task {
    private PageObject page;
    private Integer money;


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(page));
    }

    public static CharSequence getAmountMoney(){
        Integer money = 0;
        Random value = new Random();
        money = value.ints(1,500).findFirst().getAsInt();
        money = money*1000000;
        return String.valueOf(money);
    }

    public static CharSequence getMonths(){
        Integer months = 0;
        Random value = new Random();
        months = value.ints(48,84).findFirst().getAsInt();
        return String.valueOf(months);
    }

}
