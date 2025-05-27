package us.abstracta.opencart.stepdefinitions;



import  us.abstracta.opencart.questions.SearchHomePage;
import us.abstracta.opencart.questions.SearchInThankyouPage;
import us.abstracta.opencart.tasks.marketplace.AddToCart;
import us.abstracta.opencart.tasks.checkout.CompleteDeliveryDetails;
import us.abstracta.opencart.tasks.checkout.CompleteChekOutOption;
import us.abstracta.opencart.tasks.checkout.CompleteDeliveryMethod;
import us.abstracta.opencart.tasks.checkout.CompletePayMethod;
import us.abstracta.opencart.tasks.checkout.CompleteOrder;

import us.abstracta.opencart.tasks.navigate.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static us.abstracta.opencart.utils.Constants.TEXT_IN_THE_CHECKOUT;
import static org.hamcrest.Matchers.equalTo;

public class PruebaE2EStepDefinition {
    String name;

    @Before
    public void setTheStage() {

        OnStage.setTheStage(new OnlineCast());
    }


    @Given("the {string} enters in the marketplace")
    public void theEntersInTheMarketplace(String name) {
        this.name = name;
        theActorCalled(name).attemptsTo(
                NavigateTo.Opencart()


        );
        theActorCalled(name).should(
                seeThat("The text in checkout label", SearchHomePage.textLabel(), equalTo(TEXT_IN_THE_CHECKOUT))
        );
    }
    @When("add two products to the shopping cart and complete the purchase")
    public void addTwoProductsToTheShoppingCartAndCompleteThePurchase() {

        theActorInTheSpotlight().attemptsTo(
                AddToCart.twoProducts()
        );
        theActorInTheSpotlight().attemptsTo(
                CompleteChekOutOption.asGuest(),
                CompleteDeliveryDetails.buyWith("Alejandro","Ortiz","julian.ortiz@sofka.com.co","1230987456","Calle siempre viva 123","Bogotá","11121","Colombia","Bogota D.C."),
                CompleteDeliveryMethod.flatShiping(),
                CompletePayMethod.withCash(),
                CompleteOrder.confirm()

        );

    }



    @Then("the customer will see the confirmation of their purchase {string}")
    public void theCustomerWillSeeTheConfirmationOfTheirPurchaseMessage(String message) {
        theActorInTheSpotlight().should(
                seeThat("The text in Thankyou Page label", SearchInThankyouPage.textTitle(), equalTo(message))
        );

    }



}