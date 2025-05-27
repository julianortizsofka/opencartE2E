package us.abstracta.opencart.tasks.navigate;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import us.abstracta.opencart.utils.OpencartPage;

public class NavigateTo {
    public static Performable Opencart() {
        return Task.where("enters in the marketplace ",
                Open.browserOn().the(OpencartPage.class));
    }
}
