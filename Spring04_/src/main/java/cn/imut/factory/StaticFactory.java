package cn.imut.factory;

import cn.imut.service.AccountService;
import cn.imut.service.impl.AccountServiceImpl;

//静态方法
public class StaticFactory {
    public static AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
