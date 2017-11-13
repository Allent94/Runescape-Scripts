package scripts;


import org.powerbot.script.rt4.ClientContext;
import org.powerbot.script.PollingScript;
import org.powerbot.script.Script;

@Script.Manifest(name= "FighterX", description = "Fighter Test", properties = "Allen Tran; topic=999 client=4")

public class FighterX extends PollingScript<ClientContext> {

    public static int FOOD_ID = 315;


    @Override
    public void start(){

        System.out.print("Started");


    }

    public void stop(){


        System.out.print("Stopped");


    }


    @Override
    public void poll(){


        System.out.print("Running today");


    }





}
