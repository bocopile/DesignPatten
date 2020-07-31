package com.person.design.builder;

public class LGGramBulePrint extends BluePrint {

    private Computer computer;

    public LGGramBulePrint(){
        computer = new Computer("default","default","default");
    }
    @Override
    public void setCPU() {
        computer.setCpu("i9");
    }

    @Override
    public void setRam() {
        computer.setRam("8g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("512G HDD");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
