package cn.imut.service.impl;

import cn.imut.mapper.AccountMapper;
import cn.imut.pojo.Account;
import cn.imut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountMapper accountMapper;

//    public void setAccountMapper(AccountMapper accountMapper){
//        this.accountMapper = accountMapper;
//    }

    public List<Account> findAllAccount() {
        return accountMapper.findAllAccount();
    }

    public Account findAccountById(Integer accountId) {
        return accountMapper.findAccountById(accountId);
    }

    public void saveAccount(Account account) {
        accountMapper.saveAccount(account);
    }

    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    public void deleteAccount(Integer accountId) {
        accountMapper.deleteAccount(accountId);
    }
}
