package online.rzepka.Main;

import org.bukkit.plugin.java.JavaPlugin;

public class debugAPI extends JavaPlugin{

	  private static boolean debugging;
	
	  private static boolean isDebugging(){
	    return debugging;
	  }
	  
	  public static void debug (String string) {
		  if(isDebugging()) {
			  System.out.println("§7[§5DEBUG-API§7] §c" + string);
		  }
	  }
	  public static void debug (boolean enable) {
		  debugging = enable;
	  }
}


/**
* @author JOE_
*
* @created 25.07.2018 (23:05:22)
*/
