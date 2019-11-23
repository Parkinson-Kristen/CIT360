  
package webbcalendar.java.appcontrol;

import webbcalendar.java.appcontrol.ACPHandler;

import java.util.HashMap;


public class SpeakHandler implements ACPHandler {
    @Override
    public void handleIt(HashMap<String, Object> dataMap) {
        try{
            JSONOutputStream outToClient = (JSONOutputStream)dataMap.remove("toClient");
            System.out.println("Birthdate:" + dataMap + " from family");
            dataMap.put("command", "Done");
            outToClient.writeObject(dataMap);
            System.out.println("date recorded "+dataMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}