package com.person.design.bridge;

public class Main {

    public static void main(String[] args) {
        PrintMorseCode code = new PrintMorseCode(new DefaultMCF());

//        code.g();code.a();code.r();code.a();code.m();
        code.g().a().r().a().m();

        PrintMorseCode code2 = new PrintMorseCode(new SoundMCF());
        code2.g().a().r().a().m();

        PrintMorseCode code3 = new PrintMorseCode(new FlashMCF());
        code3.g().a().r().a().m();
    }
}
