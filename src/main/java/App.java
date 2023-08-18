import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloworld");

        System.out.println(bean.getMessage());
        System.out.println(bean2.getMessage());


        Cat cat = applicationContext.getBean(Cat.class);
        Cat cat2 = applicationContext.getBean(Cat.class);


        // Сравнение по ссылке
        boolean areEqual = cat == cat2;

        System.out.println("Beans are equal: " + areEqual);
    }
}