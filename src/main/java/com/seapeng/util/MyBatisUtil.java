package com.seapeng.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by zseapeng on 2016/7/21.
 */
public class MyBatisUtil {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
            InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
            //Reader reader = Resources.getResourceAsReader("com/seapeng/util/mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSession createSession(){
        return sqlSessionFactory.openSession();
    }
    public static void closeSqlSession(SqlSession sqlSession){
        sqlSession.close();
    }
}
