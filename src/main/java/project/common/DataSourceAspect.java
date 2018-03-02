package project.common;

import project.dao.ShopDao;
import project.datasource.DatabaseContextHolder;
import project.datasource.DatabaseType;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DataSourceAspect {

    /**
     * 使用空方法定义切点表达式
     */
    @Pointcut("execution(* project.dao.*.*(..))")
    public void declareJointPointExpression() {
        System.out.println("dddd");
    }

    /**
     * 使用定义切点表达式的方法进行切点表达式的引入
     */
    @Before("declareJointPointExpression()")
    public void setDataSourceKey(JoinPoint point) {
        // 连接点所属的类实例是ShopDao
        if (point.getTarget() instanceof ShopDao) {
            DatabaseContextHolder.setDatabaseType(DatabaseType.db1);
        } else {// 连接点所属的类实例是UserDao（当然，这一步也可以不写，因为defaultTargertDataSource就是该类所用的mytestdb）
            DatabaseContextHolder.setDatabaseType(DatabaseType.db2);
        }
    }
}
