package listners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/*
 * For context listners we have:
 * i. ServletContextListener: When Context initialization or destruction. Get ServletContextEvent.
 * ii. ServletContextAttributeListener: When Attribute added, removed, or replaced in the context. Get ServletContextAttributeEvent.
 */
@WebListener
public class ContextListner implements ServletContextListener {
	static int count = 0;

    public void contextDestroyed(ServletContextEvent sce)  { 
    	System.out.println("Context is destroyed: " + sce.toString());
    }

    public void contextInitialized(ServletContextEvent sce)  {
    	count++;
    	System.out.println("Context is created: " + sce.toString());
    	System.out.println("Total context object created till now: "+count);
    }
	
}
