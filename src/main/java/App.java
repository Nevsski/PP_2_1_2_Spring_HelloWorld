import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        bean3.setMessage("cat1");
        System.out.println(bean2.getMessage());

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        bean4.setMessage("cat2");
        System.out.println(bean2.getMessage());
        boolean test = bean == bean2;
        boolean test2 = bean3 == bean4;
        System.out.println(test);
        System.out.println(test2);
    }
}