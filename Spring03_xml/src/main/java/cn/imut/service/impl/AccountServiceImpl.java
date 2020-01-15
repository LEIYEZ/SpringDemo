package cn.imut.service.impl;

import cn.imut.mapper.AccountMapper;
import cn.imut.mapper.impl.AccountMapperImpl;
import cn.imut.service.AccountService;

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService{
    private AccountMapper accountMapper = new AccountMapperImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建成功!");
    }
    public void saveAccount() {
        accountMapper.saveAccount();
    }
}
