package us.abstracta.opencart.ui;

import org.openqa.selenium.By;

public class MarketplaceUI {
    public static By LABELYOURSTORE = By.id("logo");


    public static By ADDTOCARTMACKBOOK = By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[3]");
    public static By ADDTOCARTIPHONE = By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[3]");
    public static By BTNCART = By.id("cart");
    public static By BTNCHECKOUT = By.xpath("//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]");

}
