package cn.imut.mapper.impl;

import cn.imut.mapper.AccountMapper;
import org.springframework.stereotype.Repository;

/**
 * 账户持久层实现类
 */
@Repository("accountMapper")
public class AccountMapperImpl implements AccountMapper {
    public void saveAccount() {
        System.out.println("保存了账户!");
    }
}
