package com.cedaniel200.screenplay.tasks;

import com.cedaniel200.screenplay.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cedaniel200.screenplay.userinterface.HorizontalMenu.REGISTER_OPTION;
import static com.cedaniel200.screenplay.userinterface.RegisterPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Register implements Task {

    private User user;

    public Register(User user) {
        this.user = user;
    }

    public static Register the(User user) {
        return instrumented(Register.class, user);
    }

    public static Register an(User user) {
        return instrumented(Register.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Click.on(REGISTER_OPTION),
                Enter.theValue(user.name()).into(USERNAME),
                Enter.theValue(user.password()).into(PASSWORD),
                Enter.theValue(user.password()).into(CONFIRM_PASSWORD),
                Click.on(REGISTER)
        );
    }
}
