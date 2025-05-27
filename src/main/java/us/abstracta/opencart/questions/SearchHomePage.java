package us.abstracta.opencart.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import us.abstracta.opencart.ui.MarketplaceUI;

public class SearchHomePage  implements Question<String> {
    public static Question<String> textLabel(){
        return new SearchHomePage();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(MarketplaceUI.LABELYOURSTORE).getText();
    }
}
