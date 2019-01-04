package com.bwjf.service.impl;

import com.bwjf.entity.Test;
import com.bwjf.mapper.TestMapper;
import com.bwjf.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Test> testList() {
        return testMapper.testList();
    }
}
