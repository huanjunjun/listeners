package httpsessionattributelistener;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class sesstionattributelistener implements HttpSessionAttributeListener {

	public void attributeAdded(HttpSessionBindingEvent arg0) {
            System.out.println("��session�����������");
	}

	public void attributeRemoved(HttpSessionBindingEvent arg0) {
             System.out.println("��session���Ƴ�������");
	}

	public void attributeReplaced(HttpSessionBindingEvent arg0) {
            System.out.println("��session���滻������");
	}

}
