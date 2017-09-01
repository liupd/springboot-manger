package com.pmj.service;

import com.pmj.dao.GradeMapper;
import com.pmj.model.Grade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by piaomingjie on 2017/8/23.
 */
@Service
public class GradeServiceImpl implements  GradeService {
    @Autowired
    private GradeMapper gradeMapper;



    @Override
    public List<Grade> getByGradeNm() {
        return gradeMapper.getByGradeNm();
    }

    @Override
    public void save(Grade grade) {

    }
}
