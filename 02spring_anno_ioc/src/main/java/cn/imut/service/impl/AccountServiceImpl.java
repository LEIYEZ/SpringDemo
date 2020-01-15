package cn.imut.service.impl;

import cn.imut.mapper.AccountMapper;
import cn.imut.mapper.impl.AccountMapperImpl;
import cn.imut.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

/**
 * 业务层实现类
 *
 * 曾经的XML配置：
 *  <bean id="accountService" class="cn.imut.service.impl.AccountServiceImpl"
 *          scope="" init-method="" destroy-method="">
 *          指定范围    出生              销毁
 *      <property name="" value="" | ref=""></property>
 *      注入
 *  </bean>
 *  用于创建对象的注解
 *      <bean>实现功能
 *      注解：Component
 *              作用：用于把当前类对象存入spring容器中
 *              属性：
 *                  value：用于指定bean的id。不写时，默认值为当前类名，首字母改小写
 *           Controller：表现层
 *           Service：业务层
 *           Repository：持久层
 *           这三个注解作用和属性与Component一样
 *           他们三个是spring框架为我们提供明确的三层使用的注解，是我们三层对象更清晰
 *  用于注入数据的注解
 *      <property>
 *      注解：Autowired：
 *              作用：自动按照类型注入。只要容器中有唯一的一个bean对象类型和要注入的变量类型匹配，就可以注入成功
 *              出现位置：
 *                  可以是变量，方法
 *              细节：在用注解时，set方法不是必须的
 *           Qualifier:
 *              作用：在按类中注入的基础上再按名称注入。它在给类成员注入时不能单独使用。但是给方法参数注入时可以
 *              属性：
 *                  value：用于指定注入bean的id
 *           Resource
 *              作用：直接安装bean的id注入。
 *              属性：
 *                  name：用于指定注入bean的id
 *           以上注解只能注入其他bean类型的数据，而基本类型和string类型无法使用上述注解实现。
 *           另外，集合类型注入只能通过xml来实现
 *
 *           Value注解：
 *              作用：用于注入基本类型和String类型的数据
 *              属性：
 *                  value：指定值。还可以使用spring中的spEL（Spring的el表达式）
 *                          SpEL的写法：${表达式}
 *  用于改变作用范围的
 *      <scope>
 *      scope：
 *          作用：指定范围
 *          属性：
 *              value：指定范围的取值。常用取值：singleton prototype
 *  用于和生命周期相关（了解）
 *      PreDestroy  :销毁
 *      PostConstruct：初始化
 *      <init-method>   <destroy-method>
 */
@Service("accountService")
//@Scope("prototype")
public class AccountServiceImpl implements AccountService{
//    @Autowired
//    @Qualifier("accountMapper")
    @Resource(name = "accountMapper")
    private AccountMapper accountMapper = null;

    @PostConstruct
    public void init() {
        System.out.println("初始化");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("销毁");
    }
    public void saveAccount() {
        accountMapper.saveAccount();
    }
}
