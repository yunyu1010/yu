package com.yao.yu.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yao.yu.entity.PageInfo;
import com.yao.yu.entity.Student;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
public interface IStudentService extends IService<Student> {


//    /**
//     * 分页查询
//     * @param pageSize
//     * @return
//     */
//    PageInfo selectByPage(int currentPage, int pageSize, HashMap<String,Object> map)throws SQLException;
//
//    //当页的数据
//    List<Student> selectByPageItem(HashMap<String,Object> map);
//
//
//    //获取总的书籍数量
//    int totalItemNumber();

//    public List<Student> findProduct(int page,int count);
//    public Student getProduct(int id);


}
