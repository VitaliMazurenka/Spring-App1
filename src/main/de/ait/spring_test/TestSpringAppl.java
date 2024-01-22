package main.de.ait.spring_test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAppl {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext= new ClassPathXmlApplicationContext("applicationContext.xml");
        MessageBean messageBean = applicationContext.getBean("message", MessageBean.class);
        String message = messageBean.getMessage();
        System.out.println(message);
    }

}
