package cn.imut.ui;


import cn.imut.mapper.AccountMapper;
import cn.imut.service.AccountService;
import cn.imut.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService as = (AccountService)ac.getBean("accountService");
//        AccountService as2 = (AccountService)ac.getBean("accountService");
//        System.out.println(as);
//
//        AccountMapper am = ac.getBean("accountMapper",AccountMapper.class);
//        System.out.println(am);
        as.saveAccount();
        ac.close();
    }
}


