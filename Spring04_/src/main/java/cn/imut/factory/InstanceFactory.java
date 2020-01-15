package cn.imut.factory;

import cn.imut.service.AccountService;
import cn.imut.service.impl.AccountServiceImpl;

//模拟工厂类（jar包，无法修改其源码）
public class InstanceFactory {
    public AccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
