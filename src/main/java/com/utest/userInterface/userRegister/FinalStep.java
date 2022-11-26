package com.utest.userInterface.userRegister;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FinalStep {
    /*
     * Mapping the page elements
     * */
    public static final Target PASSWORD_INPUT = Target.the("Password input").located(By.id("password"));
    public static final Target PASSWORD_CONFIRM_INPUT = Target.the("Password confirm input").located(By.id("confirmPassword"));
    public static final Target STAY_INFORMED_CHECK = Target.the("Stay informed check").located(By.name("newsletterOptIn"));
    public static final Target TERMS_USE_CHECK = Target.the("Terms of use check").located(By.id("termOfUse"));
    public static final Target PRIVACY_SECURITY_POLICY_CHECK = Target.the("Privacy and Security Policy check").located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Completed setup button").located(By.id("laddaBtn"));
    public static final Target COMPLETE_SETUP_SPAN = Target.the("Completed setup span").located(By.xpath("//span[text()=\"Complete Setup\"]"));
}
