package org.firstinspires.ftc.teamcode;

public class Util {


    public static void delay(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

}
