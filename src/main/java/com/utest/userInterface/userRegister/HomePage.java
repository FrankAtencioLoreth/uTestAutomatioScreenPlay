package com.utest.userInterface.userRegister;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    /*
    * Mapeo de los elementos de la página.
    * */
    public static final Target REGISTER_BTN = Target.the("join today button").located(By.className("unauthenticated-nav-bar__sign-up"));
}
