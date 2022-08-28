package com.wwg.vue.creator.mbg.service.impl;

import com.wwg.vue.creator.mbg.mapper.SysVueResourceMapper;
import com.wwg.vue.creator.mbg.model.SysVueResourceExample;
import com.wwg.vue.creator.mbg.service.SysVueResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysVueResourceServiceImpl implements SysVueResourceService {
    @Autowired
    private SysVueResourceMapper sysVueResourceMapper;
}
