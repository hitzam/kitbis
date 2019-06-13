package com.hitzy.services;

import java.util.ArrayList;
import java.util.List;

public class Executor {
    private List<Command> commandList = new ArrayList<Command>();

    public void putCommand(Command command){
        commandList.add(command);
    }

    public void executeCommands(){

        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }

    public void executeCommand(){

        for (Command command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}