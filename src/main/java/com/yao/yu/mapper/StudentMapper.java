package com.yao.yu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yao.yu.entity.Student;
import org.apache.ibatis.annotations.Mapper;

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

}
