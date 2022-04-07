package com.xin.service;

import com.xin.pojo.Dept;

import java.util.List;

/**
 * @author KX
 * @date 2022/4/7 16:09
 */
public interface DeptService {
    /**
     * 添加部门
     * @param dept 部门信息
     * @return Boolean
     */
    Boolean addDept(Dept dept);

    /**
     * 根据id查询部门
     * @param id 部门id
     * @return Dept
     */
    Dept selectById(int id);

    /**
     * 查询所有部门
     * @return List<Dept>
     */
    List<Dept> selectAll();
}
