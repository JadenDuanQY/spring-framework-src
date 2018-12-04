package qy.jaden.main;

import org.junit.Test;
import qy.jaden.pojo.MyTestBean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import static org.junit.Assert.*;


@SuppressWarnings("deprecation")
public class BeanFactoryTest {
	@Test
	public void testSimpleload() {
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("springbean.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assertEquals("testStr", bean.getTestStr());
		System.out.println("assert over");
	}
	
	@Test
	public void testm() {
		String systemId = "http://www.Springframwork.org/Spring-beans/Spring-beans-2.0.dtd";
		int lastPathSeparator = systemId.lastIndexOf('/');
		int dtdNameStart = systemId.indexOf("Spring-beans", lastPathSeparator);
		System.out.println(dtdNameStart);
	}
	
//	@Test
//	public void w() {
//		try {
//			wait();
//		}
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("dfdsfsd");
//	}

}
