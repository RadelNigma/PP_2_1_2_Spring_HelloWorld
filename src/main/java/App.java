import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean2.getMessage());

        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getName() + " " + bean3.getAge());

        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getName() + " " + bean4.getAge());

        System.out.println("HelloWorld bean==bean2 " +  (bean==bean2));
        System.out.println("Cat bean3==bean4 " +  (bean3==bean4));
    }
}