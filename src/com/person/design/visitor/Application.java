package com.person.design.visitor;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Application {

    public static void main(String[] args) {

        ArrayList<Visitable> visitables = new ArrayList<Visitable>();
        visitables.add(new VisitableA(1));
        visitables.add(new VisitableA(2));
        visitables.add(new VisitableA(3));
        visitables.add(new VisitableA(4));
        visitables.add(new VisitableA(5));

        Visitor visitor = new VisitorA();
//        int ageSum = 0;
        for (Visitable visitable : visitables) {
            visitable.accept(visitor);
 //           ageSum += ((VisitableA)visitable).getAge();
        }

        System.out.println(((VisitorA)visitor).getAgeSum());
//        System.out.println(ageSum);
    }
}
