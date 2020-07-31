package com.person.design.bridge;

public class MorseCode {

    private MorseCodeFunction function;

    public MorseCode(MorseCodeFunction function) {
        this.function = function;
    }
    public void setFunction(MorseCodeFunction function) {
        this.function = function;
    }

    public void dot(){
        function.dot();
//        System.out.println("");
    }
    public void dash(){
        function.dash();
//        System.out.println("-");
    }
    public void space(){
        function.space();
//        System.out.println(" ");
    }
}
