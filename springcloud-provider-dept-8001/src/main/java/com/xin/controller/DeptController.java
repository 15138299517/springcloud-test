package com.xin.controller;

import com.xin.pojo.Dept;
import com.xin.service.DeptService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author KX
 * @date 2022/4/7 16:11
 */
@RestController
@RequestMapping("/dept")
public class DeptController {
    @Resource
    private DeptService deptService;

    @PostMapping("/addDept")
    public Boolean addDept(@RequestBody Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/selectById")
    public Dept selectById(@RequestParam(value = "id") Integer id) {
        return deptService.selectById(id);
    }

    @GetMapping("/selectAll")
    public List<Dept> selectAll() {
        return deptService.selectAll();
    }
}
