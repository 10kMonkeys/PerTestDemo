package com.perchwell.helpers;

import java.util.Calendar;

public class CurrentYear {

    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }
}
