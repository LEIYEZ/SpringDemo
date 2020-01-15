package cn.imut.service.impl;

import cn.imut.service.AccountService;

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService{

    public AccountServiceImpl(){
        System.out.println("对象创建成功!");
    }
    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了");
    }
}
