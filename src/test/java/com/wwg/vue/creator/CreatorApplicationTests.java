package com.wwg.vue.creator;

import com.wwg.vue.creator.service.GeneratorService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CreatorApplicationTests {

    @Autowired
    private GeneratorService generatorService;
    @Test
    public void contextLoads() {
    }

    @Test
    public void test1(){
        generatorService.start();
        generatorService.freeMarkerTest();
    }

}
