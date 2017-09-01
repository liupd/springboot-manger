package com.pmj.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by piaomingjie on 2017/8/23.
 */
public class Module {
    private Integer mid;
    private String mname;
    private Set<Role> rolses=new HashSet();

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public Set<Role> getRolses() {
        return rolses;
    }

    public void setRolses(Set<Role> rolses) {
        this.rolses = rolses;
    }
}
