package com.person.design.builder;

public class ComputerBuilder {

    private Computer computer;
    private String cpu;
    private String ram;
    private String storage;

    public ComputerBuilder(String cpu, String ram, String storage) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }

    private ComputerBuilder(){
        computer = new Computer("default","default","default");
    }

    public static ComputerBuilder start(){

        return new ComputerBuilder();
    }

    public ComputerBuilder setCpu(String cpu) {

        computer.setCpu(cpu);
        return this;
    }

    public ComputerBuilder setRam(String ram) {
        computer.setRam(ram);
        return this;
    }

    public ComputerBuilder setStorage(String storage) {
        computer.setStorage(storage);
        return this;
    }

    public Computer build(){
        return this.computer;
    }
}
