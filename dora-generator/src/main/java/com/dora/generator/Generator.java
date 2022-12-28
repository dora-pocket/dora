package com.dora.generator;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

public class Generator {

    private static final String projectRootDir = System.getProperty("user.dir");
    private static final String coreRootDir = projectRootDir + "/dora-generator";
    public static void main(String[] args){
        System.out.println(coreRootDir);
        FastAutoGenerator
                .create("jdbc:mysql://localhost:3306/dora?useUnicode=true&characterEncoding=utf-8",
                        "root",
                        "chen8888")
                .globalConfig(builder -> {
                    builder
                        .author("chen") // 设置作者
                        .enableSwagger() // 开启 swagger 模式
                        .outputDir(coreRootDir+"/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder-> {
                    builder
                        .parent("com.dora.server")
                        .entity("pojo")
                        .service("service")
                        .serviceImpl("service.impl")
                        .mapper("mapper")
                        .xml("mapper.xml")
                        .controller("controller")
                        .other("utils");
                })
                .templateConfig(builder-> {
                    builder
                        .entity( "/templates/entity.java")
                        .service( "/templates/service.java")
                        .serviceImpl("/templates/serviceImpl.java")
                        .mapper("/templates/mapper.java")
                        .xml("/templates/mapper.xml")
                        .controller("/templates/controller.java");
                })
                .strategyConfig(builder -> {
                    builder
                        // 设置需要生成的表名
                        .addInclude("sys_user","sys_pms","sys_user_role","sys_role_pms")
                        // 设置过滤表前缀
//                        .addTablePrefix("sys_", "c_")

                        .entityBuilder()
                        .enableLombok()
                        .columnNaming(NamingStrategy.underline_to_camel)
                        .controllerBuilder()
                        .enableRestStyle();
                })
                // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
