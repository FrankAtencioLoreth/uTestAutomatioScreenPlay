package com.utest.question;

import com.utest.model.Data;
import com.utest.task.UserRegisterTask;
import com.utest.userInterface.userRegister.FinalStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;
public class UserRegisterQuestion implements Question<Boolean> {

    private List<Data> data;

    public UserRegisterQuestion(List<Data> data) {
        this.data = data;
    }

    public static UserRegisterQuestion response(List<Data> data){
        return new UserRegisterQuestion(data);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String completeSetupButton = Text.of(FinalStep.COMPLETE_SETUP_SPAN).viewedBy(actor).asString();
        return data.get(0).getCompleteSetup().equals(completeSetupButton);
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
