package servletrequestlistener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

public class servletrequestlistenerdemo implements ServletRequestListener{

	public void requestDestroyed(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("request对象被销毁了");
	}

	public void requestInitialized(ServletRequestEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("request对象被创建了");

	}

}
