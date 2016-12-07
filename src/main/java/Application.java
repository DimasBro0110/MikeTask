/**
 * Created by DmitriyBrosalin on 07/12/2016.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args){

        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        Numbers num = (Numbers)context.getBean("numbersBean");
        num.devide(1, 0);
        num.devide(1, 2);
        num.devide(3, 4);
    }
}
