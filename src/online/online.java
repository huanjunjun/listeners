package online;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class online implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
	}

	public void contextInitialized(ServletContextEvent arg0) {
		arg0.getServletContext().setAttribute("count", 0);


	}

}
