package httpsessionattributelistener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class sesstionattributelistener implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {
            System.out.println("向session中添加了属性");
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
             System.out.println("向session中移除了属性");
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
            System.out.println("向session中替换了属性");
	}

}
