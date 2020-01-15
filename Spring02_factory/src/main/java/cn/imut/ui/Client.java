package cn.imut.ui;


import cn.imut.factory.BeanFactory;
import cn.imut.service.AccountService;
import cn.imut.service.impl.AccountServiceImpl;

/**
 * 模拟表现层，用于调用业务层(模拟servlet)
 */
public class Client {
    public static void main(String[] args) {
//        AccountService as = new AccountServiceImpl();
//        AccountService as = (AccountService)BeanFactory.getBean("accountService");
        for(int i = 0; i < 5; i++){
            AccountService as = (AccountService)BeanFactory.getBean("accountService");
            System.out.println(as);
        }
//        as.saveAccount();
    }
}
