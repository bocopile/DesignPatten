package com.person.design.builder;

public abstract class BluePrint {

    abstract public void setCPU();
    abstract public void setRam();
    abstract public void setStorage();

    public abstract Computer getComputer();
}
