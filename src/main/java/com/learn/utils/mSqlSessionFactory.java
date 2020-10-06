package com.learn.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class mSqlSessionFactory {
    private static  SqlSessionFactory sqlSessionFactory;
    static {
        try {
            // mybatis配置文件
            String resource = "SqlMapConfig.xml";
            // 得到配置文件流
            InputStream inputStream = null;
            inputStream = Resources.getResourceAsStream(resource);
            //创建会话工厂，传入mybatis配置文件的信息
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static  SqlSession getSqlSessionFactory()
    {
        return sqlSessionFactory.openSession();

    }
}
