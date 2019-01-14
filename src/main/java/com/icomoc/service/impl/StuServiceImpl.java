package com.icomoc.service.impl;

import com.icomoc.mapper.StuMapper;
import com.icomoc.service.IStuService;
import com.icomoc.pojo.Stu;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StuServiceImpl implements IStuService {
    @Autowired
    StuMapper stuMapper = null;

    @Override
    public List<Stu> findAll() {
        List<Stu> stus = stuMapper.findAll();
        return stus;
    }

    @Override
    public int delStu(int id) {
        int counts = stuMapper.delStu(id);

        return counts;
    }

    @Override
    public int addStu(Stu stu) {
        int counts = stuMapper.addStu(stu);

        return counts;
    }

    @Override
    public int upStu(Stu stu) {
        int counts = stuMapper.upStu(stu);
        return counts;
    }

    @Override
    public Stu getStu(int id) {
        Stu stu = stuMapper.getStu(id);
        return stu;
    }

    @Override
    public List<Stu> likeStu(String name) {
        List<Stu> stus = stuMapper.likeStu(name);
        return stus;
    }
}
