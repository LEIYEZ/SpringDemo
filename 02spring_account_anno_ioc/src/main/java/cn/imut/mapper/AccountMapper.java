package cn.imut.mapper;

import cn.imut.pojo.Account;

import java.util.List;

public interface AccountMapper {
    //查询所有
    List<Account> findAllAccount();
    //查询一个
    public Account findAccountById(Integer accountId);
    //保存操作
    public void saveAccount(Account account);
    //修改操作
    public void updateAccount(Account account);
    //删除操作
    public void deleteAccount(Integer accountId);
}
