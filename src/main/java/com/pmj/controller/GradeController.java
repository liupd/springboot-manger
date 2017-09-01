package com.pmj.controller;

import com.pmj.model.Grade;
import com.pmj.service.GradeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by piaomingjie on 2017/8/23.
 */
@RestController
public class GradeController {
    @Resource
    private GradeService gradeService;

    @RequestMapping("/getByGradeNm")
    public List<Grade> getByGradeNm(String name){
        return gradeService.getByGradeNm();
    }
}
