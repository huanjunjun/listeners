package servletlistener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class servletlistenerdemo implements ServletContextListener{

	public void contextDestroyed(ServletContextEvent arg0) {
		System.out.println("监听器销毁了！");
	}

	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("监听器创建了！");
	}
         
}
