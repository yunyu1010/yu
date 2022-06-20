package com.yao.yu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yao.yu.entity.PageInfo;
import com.yao.yu.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author yao
 * @since 2022-06-16
 */
@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    /**
     * 普通查询
     * @param username
     * @return
     */
    Student getStudentByName(String username);

}
