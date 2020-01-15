package cn.imut.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *  该类是一个配置类，它的作用和bean.xml是一样的
 *  spring中的新注解
 *  Configuration
 *      作用：指定当前类是一个配置类
 *  ComponentScan
 *      作用：用于通过注解指定spring在创建容器时要扫描的包
 *      属性：
 *          value：它和basePackages的作用是一样的，都是用于指定容器时要扫描的包
 *                  我们使用此注解就等同于在xml中配置了
 *                  <context:component-scan base-package="cn.imut"/>
 *      Bean：
 *          作用：用于把当前方法作为返回值作为bean对象存入spring的ioc容器中
 *          属性：
 *              name：用于指定bean的id， 不写时，默认值是当前方法的名称
 *
 *          细节：
 *              当我们使用注解配置方法时，若方法有参数，spring框架会去容器中查找有没有
 *              可用的bean对象。
 *              查找的方式和Autowired注解的作用是一样的
 */
@Configuration
@ComponentScan("cn.imut")


public class SpringConfiguration {
    /*
     *      用于创建一个QueryRunner对象
     */
    @Bean
    public QueryRunner createQueryRunner(DataSource dataSource){
        return new QueryRunner(dataSource);
    }

    /*
     *      创建数据源对象
     */
    @Bean(name = "dataSource")
    public DataSource createDataSource(){
        try{
            ComboPooledDataSource ds = new ComboPooledDataSource();
            ds.setDriverClass("com.mysql.jdbc.Driver");
            ds.setJdbcUrl("jdbc:mysql://localhost:3306/zl?useSS=true");
            ds.setUser("root");
            ds.setPassword("1870535196");
            return ds;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
