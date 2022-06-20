package com.yao.yu.service.impl;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yao.yu.entity.PageInfo;
import com.yao.yu.entity.Student;
import com.yao.yu.mapper.StudentMapper;
import com.yao.yu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements IStudentService {

    @Autowired
    private StudentMapper studentMapper;


//    /**
//     * 分页查询
//     *
//     * @param currentPage
//     * @param pageSize
//     * @param map
//     * @return
//     */
//    @Override
//    public PageInfo selectByPage(int currentPage, int pageSize, HashMap<String, Object> map) throws SQLException {
//        PageInfo<Student> page = new PageInfo<>();
//        page.setPageNo(currentPage);
//        page.setPageSize(pageSize);
//        page.setTotalItemNumber(totalItemNumber());
//        int pageNumber = page.getTotalPageNumber();
//        page.setTotalPageNumber(pageNumber);
//        //当前页
//        page.setList(selectByPageItem(map));
//        return null;
//    }
//
//
//    @Override
//    public List<Student> selectByPageItem(HashMap<String, Object> map) {
//        return studentMapper.selectByPageItem(map);
//    }
//
//    @ Override
//    public int totalItemNumber() {
//        return studentMapper.totalItemNumber();
//    }
}
