package com.zqhl.live.manager.dao.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.special.InsertListMapper;

public interface MyMapper <T> extends Mapper<T>,InsertListMapper<T> {

}
