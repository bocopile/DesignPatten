package com.person.design.builder;

public class main {


    public static void main(String[] args) {

        ComputerFactory factory = new ComputerFactory();

        factory.setBluePrint(new LGGramBulePrint());
        factory.make();
        Computer computer = factory.getComputer();

        System.out.println(computer.toString());

        factory.setBluePrint(new AppleBluePrint());
        factory.make();
        Computer computer2 = factory.getComputer();

        System.out.println(computer2.toString());
        //       Computer computer = factory.makeAndGet();

        // Computer computer = new Computer("i7", "16G", "256G SSD");


    }
}
