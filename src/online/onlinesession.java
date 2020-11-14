package online;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import servletlistener.servletlistenerdemo;

public class onlinesession implements HttpSessionListener {

	public void sessionCreated(HttpSessionEvent arg0) {
           HttpSession httpSession=arg0.getSession();
           System.out.println(httpSession.getId()+"上线了");
           Integer count=(Integer) httpSession.getServletContext().getAttribute("count");
           count++;
           httpSession.getServletContext().setAttribute("count", count);
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		HttpSession httpSession=arg0.getSession();
        System.out.println(httpSession.getId()+"下线了");
        Integer count=(Integer) httpSession.getServletContext().getAttribute("count");
        count--;
        httpSession.getServletContext().setAttribute("count", count);

	}

}
