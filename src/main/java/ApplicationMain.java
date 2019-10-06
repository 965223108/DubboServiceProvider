import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationMain {

    public static void main(String[] args) throws Exception
    {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("provider.xml");
        applicationContext.start();
        System.in.read();
    }
}
