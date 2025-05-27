package us.abstracta.opencart.tasks.checkout;

import net.serenitybdd.screenplay.waits.WaitUntil;
import us.abstracta.opencart.ui.CheckOutUI;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class CompletePayMethod implements Task{

    public static CompletePayMethod withCash(){
        return Tasks.instrumented(CompletePayMethod.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckOutUI.RDBUTTONCASH),
                Click.on(CheckOutUI.CBOXAGREETERMS),
                Click.on(CheckOutUI.BTNCONTINUEPAYMENT)


        );


    }
}
