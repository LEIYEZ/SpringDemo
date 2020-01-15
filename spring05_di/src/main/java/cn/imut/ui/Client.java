package cn.imut.ui;

import cn.imut.service.AccountService;
import cn.imut.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 */
public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
//        AccountService as = (AccountService)ac.getBean("accountService");
//        as.saveAccount();
//        AccountService as = (AccountService)ac.getBean("accountService1");
//        as.saveAccount();
        AccountService as = (AccountService)ac.getBean("accountService2");
        as.saveAccount();
    }
}
