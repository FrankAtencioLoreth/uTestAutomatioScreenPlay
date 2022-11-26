package com.utest.userInterface.userRegister;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Address {
    /*
     * Mapping the page elements
     * */
    public static final Target CITY_INPUT = Target.the("City input").located(By.id("city"));
    public static final Target ZIP_INPUT = Target.the("Zip input").located(By.id("zip"));
    public static final Target COUNTRY_CONTAINER = Target.the("country container").located(By.xpath("//div[@aria-label=\"Select a country\"]"));
    public static final Target COUNTRY_INPUT = Target.the("country").located(By.xpath("(//input[@aria-label=\"Select box\"])[2]"));
    public static final Target NEXT_BTN = Target.the("next").located(By.xpath("//a[@aria-label=\"Next step - select your devices\"]"));
}
