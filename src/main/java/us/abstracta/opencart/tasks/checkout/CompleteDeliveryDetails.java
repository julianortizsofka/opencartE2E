package us.abstracta.opencart.tasks.checkout;



import net.serenitybdd.screenplay.waits.WaitUntil;
import us.abstracta.opencart.ui.CheckOutUI;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;

import java.time.Duration;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;



public class CompleteDeliveryDetails implements Task{

    private final String firstname;
    private final String lastname;
    private final String eMail;
    private final String telephone;
    private final String address;
    private final String city;
    private final String postalcode;
    private final String country;
    private final String state;



    public CompleteDeliveryDetails(String firstname, String lastname, String eMail, String telephone, String address, String city, String postalcode, String country, String state){
        this.firstname = firstname;
        this.lastname = lastname;
        this.eMail = eMail;
        this.telephone = telephone;
        this.address = address;
        this.city = city;
        this.postalcode = postalcode;
        this.country = country;
        this.state = state;
    }

    public static CompleteDeliveryDetails buyWith(String firstname, String lastname, String eMail, String telephone, String address, String city, String postalcode, String country, String state){
        return Tasks.instrumented(CompleteDeliveryDetails.class, firstname,lastname,eMail,telephone,address,city,postalcode,country,state);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstname).into(CheckOutUI.INPFIRSTNAME),
                Enter.theValue(lastname).into(CheckOutUI.INPLASTNAME),
                Enter.theValue(eMail).into(CheckOutUI.INPEMAIL),
                Enter.theValue(telephone).into(CheckOutUI.INPTELEPHONE),
                Enter.theValue(address).into(CheckOutUI.INPADDRESS),
                Enter.theValue(city).into(CheckOutUI.INPCITY),
                Enter.theValue(postalcode).into(CheckOutUI.INPPSCODE),
                SelectFromOptions.byVisibleText(country).from(CheckOutUI.INPCOUNTRY),
                Click.on(CheckOutUI.INPSTATE),
                WaitUntil.the(CheckOutUI.INPSTATE, isPresent()).forNoMoreThan(Duration.ofSeconds(1)),
                SelectFromOptions.byVisibleText(state).from(CheckOutUI.INPSTATE),

                Click.on(CheckOutUI.BTNCONTINUECHECKOUT)
        );


    }
}
