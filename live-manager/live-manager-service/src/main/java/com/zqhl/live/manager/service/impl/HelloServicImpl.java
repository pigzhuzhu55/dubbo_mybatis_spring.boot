package com.zqhl.live.manager.service.impl;

import com.zqhl.live.manager.dao.service.SysRoleService;
import com.zqhl.live.manager.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("helloService")
public class HelloServicImpl implements HelloService {

    @Autowired
    private SysRoleService sysRoleServiceImpl;

    @Override
    public String getHello(int type) {


        boolean i = sysRoleServiceImpl.existsWithPrimaryKey(1);
        return String.valueOf(i);
        //return "111";
    }
}
