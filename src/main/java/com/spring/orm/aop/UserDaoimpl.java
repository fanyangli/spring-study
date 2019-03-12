package com.spring.orm.aop;

        import org.slf4j.Logger;
        import org.slf4j.LoggerFactory;

public class UserDaoimpl implements UserDao {
    private static  final Logger logger= LoggerFactory.getLogger("UserDao.class");
   @Override
    public void insert() {
        logger.info("开始进行插入操作。。。");
    }
}
