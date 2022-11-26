package com.utest.userInterface.userRegister;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalInformation {
    /*
     * Mapeo de los elementos de la página.
     * */
    public static final Target FIRST_NAME_INPUT = Target.the("First name input").located(By.id("firstName"));
    public static final Target LAST_NAME_INPUT = Target.the("Last name input").located(By.id("lastName"));
    public static final Target EMAIL_INPUT = Target.the("Email input").located(By.id("email"));
    public static final Target BIRTH_MONTH_SELECT = Target.the("Birth month").located(By.id(""));

}
