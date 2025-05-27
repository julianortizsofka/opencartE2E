package us.abstracta.opencart.tasks.checkout;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import us.abstracta.opencart.ui.CheckOutUI;

public class CompleteOrder implements Task {

    public static CompleteOrder confirm(){
        return Tasks.instrumented(CompleteOrder.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckOutUI.BTNCONFIRMORDER)


        );


    }
}
