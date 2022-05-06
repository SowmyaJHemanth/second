package springgrps;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainPrg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource resource = new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee e1 = (Employee) factory.getBean("emp");
		System.out.println(e1);
		
		Employee e2 = (Employee) factory.getBean("emp1");
		System.out.println(e2);
				
		
		/*hi this is for example.... heehhehehehhe*/
	}

}
