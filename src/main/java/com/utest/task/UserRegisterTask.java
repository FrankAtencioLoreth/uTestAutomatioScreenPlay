package com.utest.task;


import com.utest.model.Data;
import com.utest.userInterface.userRegister.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserRegisterTask implements Task {

    private List<Data> data;

    public UserRegisterTask(List<Data> data){
        this.data = data;
    }

    public static UserRegisterTask instrumentdClass(List<Data> data){
        return instrumented(UserRegisterTask.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                /*HomePage*/
                Click.on(HomePage.REGISTER_BTN),

                /*Personal Information*/
                Enter.theValue(data.get(0).getFisrtName()).into(PersonalInformation.FIRST_NAME_INPUT),
                Enter.theValue(data.get(0).getLastName()).into(PersonalInformation.LAST_NAME_INPUT),
                Enter.theValue(data.get(0).getEmail()).into(PersonalInformation.EMAIL_INPUT),
                SelectFromOptions.byVisibleText(data.get(0).getBirthMonth()).from(PersonalInformation.BIRTH_MONTH_SELECT),
                SelectFromOptions.byVisibleText(data.get(0).getBirthDay()).from(PersonalInformation.BIRTH_DAY_SELECT),
                SelectFromOptions.byVisibleText(data.get(0).getBirthYear()).from(PersonalInformation.BIRTH_YEAR_SELECT),
                Enter.theValue(data.get(0).getLanguage()).into(PersonalInformation.LANGUAGE_SELECT).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(PersonalInformation.NEXT_BUTTON),

                /*Address*/
                SendKeys.of(data.get(0).getCity()+", ").into(Address.CITY_INPUT),
                SendKeys.of(data.get(0).getState()+", ").into(Address.CITY_INPUT),
                SendKeys.of(data.get(0).getCountry()).into(Address.CITY_INPUT).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Enter.theValue(data.get(0).getZip()).into(Address.ZIP_INPUT),
                Click.on(Address.COUNTRY_CONTAINER),
                Enter.theValue(data.get(0).getCountry()).into(Address.COUNTRY_INPUT).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(Address.NEXT_BTN),

                /*Devices*/
                Click.on(Devices.COMPUTER_CONTAINER),
                Enter.theValue(data.get(0).getComputer()).into(Devices.COMPUTER_INPUT).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(Devices.VERSION_CONTAINER),
                Enter.theValue(data.get(0).getVersion()).into(Devices.VERSION_INPUT).thenHit(Keys.ENTER),
                Click.on(Devices.LANGUAGE_CONTAINER),
                Enter.theValue(data.get(0).getComputer_language()).into(Devices.LANGUAGE_INPUT).thenHit(Keys.ENTER),
                Click.on(Devices.MOBILE_BRAND_CONTAINER),
                Enter.theValue(data.get(0).getMobile_device()).into(Devices.MOBILE_BRAND_INPUT).thenHit(Keys.ENTER),
                Click.on(Devices.MOBILE_MODEL_CONTAINER),
                Enter.theValue(data.get(0).getModel()).into(Devices.MOBILE_MODEL_INPUT).thenHit(Keys.ENTER),
                Click.on(Devices.MOBILE_OS_CONTAINER),
                Enter.theValue(data.get(0).getMobile_os()).into(Devices.MOBILE_OS_INPUT).thenHit(Keys.ENTER),
                Click.on(Devices.NEXT_BTN),

                /*Final step*/
                SendKeys.of(data.get(0).getPassword()).into(FinalStep.PASSWORD_INPUT),
                SendKeys.of(data.get(0).getPassword_confirm()).into(FinalStep.PASSWORD_CONFIRM_INPUT),
                Click.on(FinalStep.STAY_INFORMED_CHECK),
                Click.on(FinalStep.TERMS_USE_CHECK),
                Click.on(FinalStep.PRIVACY_SECURITY_POLICY_CHECK),
                Click.on(FinalStep.COMPLETE_SETUP_BUTTON)

        );
    }
}
