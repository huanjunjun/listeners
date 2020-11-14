package httpsessionlistener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class httpsessionlintneerdemo implements HttpSessionListener{

	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("httpsession对象被创建了");
	}

	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("httpsession对象被销毁了");
	}
       
}
