package com.dariakovtun.app.classwork3.lesson3;

/**
 * Created by Кики on 13.11.2016.
 */
public class NarrowingCasting {
    int int1 = 0;

    float float1 = 3.84159f;

    public void narrowing(){

        int1 = (int) float1;

//Should get error

//”Explicit cast needed to convert float to int”

        System.out.println(int1);

    }
}
