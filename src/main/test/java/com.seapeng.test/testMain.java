package com.seapeng.test;

import com.seapeng.inter.TUserMapper;
import com.seapeng.model.TUser;
import com.seapeng.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by zseapeng on 2016/8/4.
 */
public class testMain {
    private TUserMapper tUserMapper;
    private TUser tUser;
    @org.junit.Test
    public void testMybatis(){
        SqlSession sqlSession = MyBatisUtil.createSession();
        tUserMapper = sqlSession.getMapper(TUserMapper.class);
        tUser = tUserMapper.selectByPrimaryKey(1);
        MyBatisUtil.closeSqlSession(sqlSession);
        System.out.println("id= "+tUser.getId());
        System.out.println("username= "+tUser.getUserName());
        System.out.println("password= "+tUser.getUserPasswd());
    }
}
