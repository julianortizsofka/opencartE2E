package us.abstracta.opencart.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import us.abstracta.opencart.ui.ThankuPageUI;

public class SearchInThankyouPage implements Question<String>{
    public static Question<String> textTitle(){
        return new SearchInThankyouPage();
    }

    @Override
    public String answeredBy(Actor actor){
        return BrowseTheWeb.as(actor).find(ThankuPageUI.LBLTHANKYOU).getText();
    }

}
