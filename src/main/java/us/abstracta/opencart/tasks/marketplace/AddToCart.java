package us.abstracta.opencart.tasks.marketplace;

import us.abstracta.opencart.ui.CheckOutUI;
import us.abstracta.opencart.ui.MarketplaceUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddToCart implements Task{
    public static AddToCart twoProducts(){
        return Tasks.instrumented(AddToCart.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MarketplaceUI.ADDTOCARTIPHONE),
                Click.on(MarketplaceUI.ADDTOCARTMACKBOOK),
                Click.on(MarketplaceUI.BTNCART),
                Click.on(MarketplaceUI.BTNCHECKOUT),
                WaitUntil.the(CheckOutUI.LABELCHECKOUT, isVisible())
        );


    }
}
