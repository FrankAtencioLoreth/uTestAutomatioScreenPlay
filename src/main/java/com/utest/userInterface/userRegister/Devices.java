package com.utest.userInterface.userRegister;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Devices {
    /*
     * Mapping the page elements
     * */
    public static final Target COMPUTER_CONTAINER = Target.the("computer").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[1]"));
    public static final Target COMPUTER_INPUT = Target.the("computer imput").located(By.xpath("(//input[@type=\"search\"])[1]"));
    public static final Target VERSION_CONTAINER = Target.the("computer").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[2]"));
    public static final Target VERSION_INPUT = Target.the("computer imput").located(By.xpath("(//input[@type=\"search\"])[2]"));
    public static final Target LANGUAGE_CONTAINER = Target.the("computer").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]"));
    public static final Target LANGUAGE_INPUT = Target.the("computer imput").located(By.xpath("(//input[@type=\"search\"])[3]"));
    public static final Target MOBILE_BRAND_CONTAINER = Target.the("computer").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]"));
    public static final Target MOBILE_BRAND_INPUT = Target.the("computer imput").located(By.xpath("(//input[@type=\"search\"])[4]"));
    public static final Target MOBILE_MODEL_CONTAINER = Target.the("computer").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]"));
    public static final Target MOBILE_MODEL_INPUT = Target.the("computer imput").located(By.xpath("(//input[@type=\"search\"])[5]"));
    public static final Target MOBILE_OS_CONTAINER = Target.the("computer").located(By.xpath("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]"));
    public static final Target MOBILE_OS_INPUT = Target.the("computer imput").located(By.xpath("(//input[@type=\"search\"])[6]"));
    public static final Target NEXT_BTN = Target.the("next").located(By.xpath("//a[@aria-label=\"Next - final step\"]"));
}
