package us.abstracta.opencart.tasks.checkout;

import net.serenitybdd.screenplay.waits.WaitUntil;
import us.abstracta.opencart.ui.CheckOutUI;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

public class CompleteChekOutOption implements Task {
    public static CompleteChekOutOption asGuest(){
        return Tasks.instrumented(CompleteChekOutOption.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckOutUI.RDBUTTONGUEST),
                Click.on(CheckOutUI.BTNCONTINUECHECKOUTOPTION)


        );


    }
}
