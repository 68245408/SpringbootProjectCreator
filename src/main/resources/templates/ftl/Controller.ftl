package com.wwg.vue.creator.mbg.controller;

import com.wwg.vue.creator.mbg.AbstractController;
import com.wwg.vue.creator.mbg.model.SysVueResource;
import com.wwg.vue.creator.mbg.service.SysVueResourceService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sysVueResource")
@Api(tags = "SysVueResourceController", description = "SysVueResourceController")
public class SysVueResourceController extends AbstractController {
@Autowired
private SysVueResourceService sysVueResourceService;
}
