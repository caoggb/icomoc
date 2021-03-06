package com.icomoc.service;

import com.icomoc.pojo.Stu;

import java.util.List;

public interface IStuService {
    /**
     * 查找学校
     *
     * @return
     */
    public List<Stu> findAll();

    /**
     * 删除学生
     */
    public int delStu(int id);

    /**
     * 添加学校
     */
    public int addStu(Stu stu);

    /**
     * 修改学生信息
     */
    public int upStu(Stu stu);

    /**
     * 查找学生
     */
    public Stu getStu(int id);

    /**
     * 模糊查找
     */
    public List<Stu> likeStu(String name);


}
