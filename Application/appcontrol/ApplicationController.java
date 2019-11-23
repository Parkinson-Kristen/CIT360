package webbcalendar.java.appcontrol;

import java.util.HashMap;
//import java.util.logging.Handler;

public class ApplicationController {
    private HashMap<String,ACPHandler> handlerMap = new HashMap<String,ACPHandler>();

    public void handleRequest(String command, HashMap<String,Object> data){
        ACPHandler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, ACPHandler acHandler){
        handlerMap.put(aCommand,acHandler);
    }
}