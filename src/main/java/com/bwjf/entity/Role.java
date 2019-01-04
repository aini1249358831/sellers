package com.bwjf.entity;

import java.util.HashSet;
import java.util.Set;

public class Role {
    private Integer rid;

    private String rname;

    public Set<Module> getModules() {
        return modules;
    }

    public void setModules(Set<Module> modules) {
        this.modules = modules;
    }

    private Set<Module> modules = new HashSet();

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }
}