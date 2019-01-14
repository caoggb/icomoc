package com.icomoc.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.icomoc.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.icomoc.pojo.Stu;

@Controller
public class StuController {

    @Autowired
    private IStuService iStuService = null;

    /*
     * 商品详情
     */
    @RequestMapping(value = "/findStu", method = { RequestMethod.POST, RequestMethod.GET })
    public void findStu(HttpServletRequest request, HttpServletResponse response) {
        List<Stu> stuList = iStuService.findAll();
        request.setAttribute("stu", stuList);

        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    /*
     * 删除用户
     */
    @RequestMapping(value = "/delStu", method = { RequestMethod.POST, RequestMethod.GET })
    public void delStu(int id, HttpServletRequest request, HttpServletResponse response) {
        iStuService.delStu(id);
        List<Stu> stuList = iStuService.findAll();
        request.setAttribute("stu", stuList);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /*
     * 添加学生
     */
    @RequestMapping(value = "/addStu", method = { RequestMethod.POST, RequestMethod.GET })
    public void addStu(Stu student, HttpServletRequest request, HttpServletResponse response) {
        iStuService.addStu(student);
        List<Stu> stuList = iStuService.findAll();
        request.setAttribute("stu", stuList);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /*
     * 获取学生信息
     */
    @RequestMapping(value = "/getStu", method = { RequestMethod.POST, RequestMethod.GET })
    public void getStu(int id, HttpServletRequest request, HttpServletResponse response) {
        Stu restu=iStuService.getStu(id);
        request.setAttribute("restu", restu);
        try {
            request.getRequestDispatcher("/up.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /*
     * 获取学生信息
     */
    @RequestMapping(value = "/upStu", method = { RequestMethod.POST, RequestMethod.GET })
    public void upStu(Stu student, HttpServletRequest request, HttpServletResponse response) {
        iStuService.upStu(student);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    /*
     * 模糊查找
     */
    @RequestMapping(value = "/likeStu", method = { RequestMethod.POST, RequestMethod.GET })
    public void likeStu(String name, HttpServletRequest request, HttpServletResponse response) {
        List<Stu>listStu=iStuService.likeStu("%"+name+"%");
        request.setAttribute("stu", listStu);
        try {
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        } catch (ServletException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
