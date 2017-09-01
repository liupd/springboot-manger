package com.pmj.service;

import com.pmj.model.Grade;

import java.util.List;

/**
 * Created by piaomingjie on 2017/8/23.
 */
public interface GradeService {
    public List<Grade> getByGradeNm();
    public void save(Grade grade);
}
