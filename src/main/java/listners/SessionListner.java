package listners;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * For Session Listener we have:
 * i. HttpSessionListner: Session creation or destruction. Get HttpSessionEvent.
 * ii. HttpSessionAttributeListener: Attribute added, removed, or replaced in a session.Get HttpSessionBindingEvent.
 * iii. HttpSessionBindingListener: Object added to or removed from a session. gets HttpSessionBindingEvent (implemented by the bound object itself).
 * iv. HttpSessionActivationListener: Session passivation or activation.get HttpSessionEvent 
 *
 */
@WebListener
public class SessionListner implements HttpSessionListener {
	static int count = 0;
	
    public void sessionCreated(HttpSessionEvent se)  {
    	count++;
         System.out.println("New session is created: "+se.toString());
         System.out.println("Total sessions created till now: "+ count);
    }

    public void sessionDestroyed(HttpSessionEvent se)  { 
         System.out.println("Session is destroyed: " + se.toString());
    }
	
}
