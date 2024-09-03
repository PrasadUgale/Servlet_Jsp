package listners;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * For Request Listners we have 
 * i. ServletRequestListner: listen to new request being initialized or destroyed
 * 		Get ServletRequestEvent object
 * ii. ServletRequestAttributeListner: Listen for new attribute added, removed or replaced
 * 		Get ServletRequestAttributeEvent
 */
@WebListener
public class RequestListner implements ServletRequestListener {
	static int count = 0;

    public void requestDestroyed(ServletRequestEvent sre)  { 
    	
         System.out.println("Request object is destroyed: " +sre.toString());
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
    	count++;
         System.out.println("New Request initialized: "+sre.toString());
         System.out.println("Total Request initialized till now: "+ count);
    }
	
}
