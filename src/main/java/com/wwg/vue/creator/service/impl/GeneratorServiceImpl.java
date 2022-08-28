package com.wwg.vue.creator.service.impl;

import com.wwg.vue.creator.mbg.Generator;
import com.wwg.vue.creator.service.GeneratorService;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import freemarker.template.Version;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.stereotype.Service;

import java.io.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
public class GeneratorServiceImpl implements GeneratorService {
    @Override
    public void start(){

        try {
            //MBG 执行过程中的警告信息
            List<String> warnings = new ArrayList<String>();
            //当生成的代码重复时，覆盖原代码
            boolean overwrite = true;
            //读取我们的 MBG 配置文件
            InputStream is = Generator.class.getResourceAsStream("/generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = null;
            config = cp.parseConfiguration(is);
            is.close();

            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            //创建 MBG
            MyBatisGenerator myBatisGenerator = null;
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            //执行生成代码
            myBatisGenerator.generate(null);
            //输出警告信息
            for (String warning : warnings) {
                System.out.println(warning);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
        }
        catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }catch (InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void freeMarkerTest(){
        freemarker.template.Configuration configuration = new freemarker.template.Configuration(new Version("2.3.3"));
        configuration.setDefaultEncoding("utf-8");
        String absolutePath = System.getProperty("user.dir") + "\\src\\main\\resources\\templates";
        try{
            // 加载.ftl配置文件所在路径
            configuration.setDirectoryForTemplateLoading(new File(absolutePath));

            // 放模板变量的值
            Map<String,Object> params = new HashMap<>();
            Date dNow = new Date( );
            SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
            params.put("package","io.demo.generator");
            params.put("mapper","dao");
            params.put("author","wwg");
            params.put("date",ft.format(dNow));
            params.put("comments","freemarker模板");
            params.put("className","GenerateFile");
            params.put("mapperSuffix","Mapper");

            //给文件赋值
            Template template = configuration.getTemplate("Mapper.java.ftl");
            // 文件输出路径
            FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") +"\\output\\GenerateFileMapper.java");
            OutputStreamWriter out = new OutputStreamWriter(file, "utf-8");
            template.process(params,out);
            out.close();
        }catch (IOException | TemplateException exception) {
            exception.printStackTrace();
        }
    }
}
