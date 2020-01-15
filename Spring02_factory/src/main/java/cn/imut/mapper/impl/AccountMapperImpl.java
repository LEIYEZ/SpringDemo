package cn.imut.mapper.impl;

import cn.imut.mapper.AccountMapper;

/**
 * 账户持久层实现类
 */
public class AccountMapperImpl implements AccountMapper {
    public void saveAccount() {
        System.out.println("保存了账户!");
    }
}
