package servletlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class servletlistenerdemo implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("�����������ˣ�");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("�����������ˣ�");
	}
         
}
