package com.utest.task;


import com.utest.userInterface.userRegister.HomePage;
import com.utest.userInterface.userRegister.PersonalInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserRegisterTask implements Task {

    public static UserRegisterTask instrumentdClass(){
        return instrumented(UserRegisterTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                /*HomePage*/
                Click.on(HomePage.REGISTER_BTN),

                /*PersonalInformation*/
                Enter.theValue("Frank Camilo").into(PersonalInformation.FIRST_NAME_INPUT),
                Enter.theValue("Atencio Loreth").into(PersonalInformation.FIRST_NAME_INPUT)

        );
    }
}
