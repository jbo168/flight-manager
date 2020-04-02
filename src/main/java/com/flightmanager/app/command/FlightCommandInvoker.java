package com.flightmanager.app.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: John Long
 * @create: 17-Mar-2020
 **/

public class FlightCommandInvoker {
    public List<FlightCommand> flightCommandList = new ArrayList<>();

    public void executeCommand(FlightCommand flightCommand){
        flightCommandList.add(flightCommand);
        flightCommand.execute();
    }

}