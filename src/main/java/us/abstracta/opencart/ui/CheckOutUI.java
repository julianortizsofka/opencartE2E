package us.abstracta.opencart.ui;

import org.openqa.selenium.By;

public class CheckOutUI {
    public static By LABELCHECKOUT = By.id("checkout-checkout");

    public static By RDBUTTONGUEST = By.xpath("//input[@name='account' and @value='guest']");

    public static By BTNCONTINUECHECKOUTOPTION = By.id("button-account");

    public static By INPFIRSTNAME = By.id("input-payment-firstname");

    public static By INPLASTNAME = By.id("input-payment-lastname");

    public static By INPEMAIL = By.id("input-payment-email");

    public static By INPTELEPHONE = By.id("input-payment-telephone");

    public static By INPADDRESS = By.id("input-payment-address-1");

    public static By INPCITY = By.id("input-payment-city");

    public static By INPPSCODE = By.id("input-payment-postcode");

    public static By INPCOUNTRY = By.id("input-payment-country");

    public static By INPSTATE = By.id("input-payment-zone");




    public static By BTNCONTINUECHECKOUT = By.id("button-guest");


    public static By RDBUTTONFLATSHIPPING = By.xpath("//input[@name='shipping_method' and @value='flat.flat']");


    public static By BTNCONTINUEDELIVERY = By.id("button-shipping-method");

    public static By RDBUTTONCASH = By.xpath("//input[@name='payment_method' and @value='cod']");


    public static By CBOXAGREETERMS = By.xpath("//input[@name='agree' and @value='1']");

    public static By BTNCONTINUEPAYMENT = By.id("button-payment-method");

    public static By BTNCONFIRMORDER = By.id("button-confirm");
}
