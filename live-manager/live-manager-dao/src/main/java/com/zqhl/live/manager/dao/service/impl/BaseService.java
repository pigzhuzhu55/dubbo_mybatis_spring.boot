package com.zqhl.live.manager.dao.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zqhl.live.manager.dao.service.IService;
import com.zqhl.live.manager.dao.util.MyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;

public abstract class BaseService<T,ID extends Serializable> implements IService<T,ID> {

    @Autowired
    protected MyMapper<T> myMapper;

    public T insert(T entity) {
        myMapper.insert(entity);
        return entity;
    }

    public T insertSelective(T entity){
        myMapper.insertSelective(entity);
        return entity;
    }

    public int updateByExample(T entity,Example example) {
        return myMapper.updateByExample(entity,example);
    }

    public int updateByExampleSelective(T entity,Example example) {
        return myMapper.updateByExampleSelective(entity,example);
    }

    public int delete(T entity) {
        return myMapper.delete(entity);
    }

    public int deleteByPrimaryKey(ID id) {
        return myMapper.deleteByPrimaryKey(id);
    }

    public int updateByPrimaryKey(T entity) {
        return myMapper.updateByPrimaryKey(entity);
    }

    public int updateByPrimaryKeySelective(T entity) {
        return myMapper.updateByPrimaryKeySelective(entity);
    }

    public boolean existsWithPrimaryKey(ID id)
    {
        return myMapper.existsWithPrimaryKey(id);
    }

    public T queryOneByExample(Example example)
    {
        return myMapper.selectOneByExample(example);
    }

    public T queryOneByPrimaryKey(ID id){

        return myMapper.selectByPrimaryKey(id);
    }

    public List<T> queryByExample(Example example)
    {
        return myMapper.selectByExample(example);
    }

    public int selectCountByExample(Example example){
        return myMapper.selectCountByExample(example);
    }



    /**
     * 不满足条件的才更新
     * 不更新null字段
     * @param entity
     * @param example
     * @return
     */
    public int updateOneByPrimaryKeyNotAtExampleSelective(T entity,Example example)
    {
        int cnt = myMapper.selectCountByExample(example);
        if( cnt > 0)
        {
            return 0;
        }
        else
        {
            return myMapper.updateByPrimaryKeySelective(entity);
        }
    }
    /**
     * 不满足条件的才插入
     * 不更新null字段
     * @param entity
     * @param example
     * @return
     */
    public int insertOneNotAtExampleSelective(T entity, Example example)
    {
        int cnt = myMapper.selectCountByExample(example);
        if( cnt > 0)
        {
            return 0;
        }
        else
        {
            return myMapper.insertSelective(entity);
        }
    }

    /**
     * 自定义查询条件，分页查询
     * @param example
     * @param page
     * @param rows
     * @return
     */
    public PageInfo<T> queryPageListByExample(Example example, Integer page, Integer rows) {
        PageHelper.startPage(page, rows, true);// 设置分页参数
        // 查询数据
        List<T> lists = myMapper.selectByExample(example);
        return new PageInfo<T>(lists);
    }

    /**
     *批量插入数据
     * @param list
     * @return
     */
    public int insertList(List<T> list)
    {
        return myMapper.insertList(list);
    }
}
