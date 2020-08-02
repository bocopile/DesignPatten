package com.person.design.command;

import java.util.Comparator;

public interface Command extends Comparable<Command> {

    void execute();

}
