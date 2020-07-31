package com.person.design.builder;

public class AppleBluePrint extends BluePrint {

    private Computer computer;

    public AppleBluePrint(){
        computer = new Computer("default","default","default");
    }
    @Override
    public void setCPU() {
        computer.setCpu("i9");
    }

    @Override
    public void setRam() {
        computer.setRam("32g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1T HDD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
