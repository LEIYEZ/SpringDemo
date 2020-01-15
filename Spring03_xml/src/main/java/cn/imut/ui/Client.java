package cn.imut.ui;


import cn.imut.mapper.AccountMapper;
import cn.imut.service.AccountService;
import cn.imut.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层，用于调用业务层(模拟servlet)
 * 获取spring的IOC核心容器，并根据id获取对象
 *
 * ApplicationContext的三个实现类：
 *      ClassPathXmlApplicationContext      ：   它可以加载路径下的配置文件，要求配置文件必须在类路径下。否则，无法加载。
 *      FileSystemXmlApplicationContext     ：   它可以加载磁盘任意路径下的配置文件(必修有访问权限)。
 *      AnnotationConfigApplicationContext  ：   它是用于读取注解创建容器的。
 *
 * 核心容器的两个接口引发出的问题：
 *      ApplicationContext：         单例对象适用              采用此接口
 *          它在构建核心容器时，创建对象采用的策略是采用立即加载的方式。也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
 *      BeanFactory：                多例对象适用
 *          它在构建核心容器时，创建对象采取的策略是延迟加载的方式。也就是说什么时候根据id获取对象，什么时候才真正创建对象。
 */
public class Client {
    public static void main(String[] args) {
        //1.获取核心容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2.根据id获取Bean对象
        AccountService as = (AccountService)ac.getBean("accountService");
//        AccountMapper am = (AccountMapper)ac.getBean("accountMapper");
        AccountMapper am = ac.getBean("accountMapper",AccountMapper.class);     //第二种方式

        System.out.println(as);
        System.out.println(am);
//        as.saveAccount();
    }
}
