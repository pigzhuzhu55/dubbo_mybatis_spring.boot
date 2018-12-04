package com.zqhl.live.manager.dao;

import com.zqhl.live.manager.dao.service.SysRoleService;
import com.zqhl.live.manager.po.SysRole;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerApplicationTests {

    @Autowired
    private SysRoleService sysRoleServiceImpl;

    @Test
    public void contextLoads() {

        SysRole s =  sysRoleServiceImpl.queryOneByPrimaryKey(1);

        Assert.assertNotNull(s);
    }

}
