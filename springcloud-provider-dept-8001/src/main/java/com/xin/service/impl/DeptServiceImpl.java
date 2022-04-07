package com.xin.service.impl;

import com.xin.pojo.Dept;
import com.xin.dao.DeptMapper;
import com.xin.service.DeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author KX
 * @date 2022/4/7 16:09
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Resource
    private DeptMapper deptMapper;

    @Override
    public Boolean addDept(Dept dept) {
        return deptMapper.addDept(dept);
    }

    @Override
    public Dept selectById(int id) {
        return deptMapper.selectById(id);
    }

    @Override
    public List<Dept> selectAll() {
        return deptMapper.selectAll();
    }
}
