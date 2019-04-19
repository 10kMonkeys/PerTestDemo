package com.perchwell.helpers;

import net.serenitybdd.core.Serenity;

public abstract class SessionVariables {

    public static void addValueInSessionVariable(String name, String value) {
        Serenity.setSessionVariable(name).to(value);
    }

    public static String getValueFromSessionVariable(String name) {
        return Serenity.sessionVariableCalled(name);
    }
}
