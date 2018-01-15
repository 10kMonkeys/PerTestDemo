package com.perchwell.helpers;

import java.util.TimerTask;

public class TravisAlive extends TimerTask{

    @Override
    public void run() {
        System.out.println("Keeping Travis Alive");
    }
}
