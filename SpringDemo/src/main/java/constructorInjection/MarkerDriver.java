package constructorInjection;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class MarkerDriver {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("DemoConst.xml");
		BeanFactory bf=new XmlBeanFactory(cpr);	
		Marker m=(Marker)bf.getBean("myMarker");
		m.dispMarker();
	}
}
