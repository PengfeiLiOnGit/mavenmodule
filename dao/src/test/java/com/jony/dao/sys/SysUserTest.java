package com.jony.dao.sys;

import com.jony.dao.sys.entity.SysUser;
import com.jony.dao.sys.mapper.SysUserMapper;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext.xml"})
@Rollback(true)
public class SysUserTest {

    @Autowired
    private SysUserMapper mapper;

    @BeforeClass
    public static void doBefore(){

    }

    @Test
    public void doSomething(){
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        SysUserMapper mapper = sqlSession.getMapper(SysUserMapper.class);
        List<SysUser> users = mapper.selectAll();

    }
}
