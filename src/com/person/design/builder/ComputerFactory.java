package com.person.design.builder;

public class ComputerFactory {

    private BluePrint print;

    public void setBluePrint(BluePrint print){
        this.print = print;
    }

    public void make(){
        print.setCPU();
        print.setRam();
        print.setStorage();
    }

    public Computer getComputer(){
        return print.getComputer();
    }
}
