package cn.imut.service.impl;

import cn.imut.service.AccountService;

import java.util.Date;

/**
 * 业务层实现类
 */
public class AccountServiceImpl1 implements AccountService{

    private String name;
    private Integer age;
    private Date birthday;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println("service中的saveAccount方法执行了+"+name+","+age+","+birthday);
    }
}
