package com.utest.task;


import com.utest.userInterface.userRegister.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserRegisterTask implements Task {

    public static UserRegisterTask instrumentdClass(){
        return instrumented(UserRegisterTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                /*HomePage*/
                Click.on(HomePage.REGISTER_BTN)

                /*PersonalInformation*/

        );
    }
}
