package cn.imut.service.impl;

import cn.imut.factory.BeanFactory;
import cn.imut.mapper.AccountMapper;
import cn.imut.mapper.impl.AccountMapperImpl;
import cn.imut.service.AccountService;

/**
 * 业务层实现类
 */
public class AccountServiceImpl implements AccountService{
//    private AccountMapper accountMapper = new AccountMapperImpl();
    private AccountMapper accountMapper = (AccountMapper) BeanFactory.getBean("accountMapper");
    public void saveAccount() {
        accountMapper.saveAccount();
    }
}
