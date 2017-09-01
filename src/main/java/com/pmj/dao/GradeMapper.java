package com.pmj.dao;

import com.pmj.model.Grade;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by piaomingjie on 2017/8/23.
 */
public interface GradeMapper {
    @Select("select * from grade")
    public List<Grade> getByGradeNm();

    @Insert("insert into grade(grade_nm,teacher_id) values(#{gradeNm},#{teacherId})")
    @Options(useGeneratedKeys=true,keyColumn="id",keyProperty="id")//设置id自增长
    public void save(Grade grade);
}
