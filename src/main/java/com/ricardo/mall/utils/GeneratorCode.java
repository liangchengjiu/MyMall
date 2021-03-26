package com.ricardo.mall.utils;


import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

import java.io.File;
import java.nio.file.Paths;

/**
 * @program: MyMall
 * @description: MyBatis-Plus-Generator整合Swagger2
 * @author: liangchengjiu
 * @create: 2021-03-27 00:41
 **/

public class GeneratorCode {

    // 数据库类型
    private final DbType dbType = DbType.MYSQL;
    // 数据库连结信息
    private final String dbUrl =
            "jdbc:mysql://localhost:3306/mymall?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
    private final String driver =
            "com.mysql.cj.jdbc.Driver";
    private final String userName = "root";
    private final String password = "admin";

    // 项目名(路径 + 项目名）
    private final String projectName = System.getProperty("user.dir"); // + "/provider/provider-service";
    // 指定包名
    private final String packageName = "com.ricardo.mall.pms";
    private final String packageNameC = "com/ricardo/mall/pms";

    // controller基础类
    private final String superControllerClass = packageNameC + "controller";
    // entity基础类
    private final String superEntityClass = packageNameC + ".entity";
    // 模块名 如果有模块名，则需在模块名前加. 例：.log
    private final String moduleName = "";
    // 作者名
    private final String author = "Dawson·Ricardo";

    // @todo指定生成的表名 @todo
    private final String[] tableNames = new String[]{
            "pms_brand",
            "pms_product",
            "pms_product_attribute",
            "pms_product_attribute_category",
            "pms_product_attribute_value",
            "pms_product_category"
    };


    //    private static String packageName = "com.asita.renovation";
//    private static String outDir = "F:\\java_web\\renovation\\src\\main\\java";
    private static String entity = "entity";
    private static String mapper = "mapper";
    private static String service = "service";
    private static String impl = "service.impl";
    private static String controller = "controller";
    private static String xml = "mapper";

    private static boolean isOverEntity = true;
    private static boolean isOverController = false;
    private static boolean isOverService = false;
    private static boolean isOverServiceImpl = false;
    private static boolean isOverMapper = false;
    private static boolean isOverXml = false;

    // Swagger2
    private static boolean isSwagger2 = true;

    private static String entityVM = "/templates/entity.vm";
    private static String controllerVM = "/templates/controller.vm";
    private static String serviceVM = "";
    private static String serviceImplVM = "";
    private static String mapperVM = "";
    private static String xmlVM = "";

    private static String[] baseDir = {entity, mapper, service, impl, controller};

    @Test
    public void generateCode() {
        //user -> UserService, 设置成true: user -> IUserService
        boolean serviceNameStartWithI = false;
        generateByTables(serviceNameStartWithI, packageName, tableNames);
    }

    private void generateByTables(boolean serviceNameStartWithI, String packageName, String... tableNames) {
        GlobalConfig config = new GlobalConfig();
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(dbType)
                .setUrl(dbUrl)
                .setUsername(userName)
                .setPassword(password)
                .setDriverName(driver);


        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(false)
                .setEntityLombokModel(true)
//                .setDbColumnUnderline(true)
                .setRestControllerStyle(true)
//                .entityTableFieldAnnotationEnable(false)
                .setNaming(NamingStrategy.underline_to_camel)
                //修改替换成你需要的表名，多个表名传数组
                .setInclude(tableNames);
        config.setActiveRecord(true)
                .setAuthor(author)
                .setOutputDir(getOutputDir(projectName))
                // 不打开输出目录
                .setOpen(false)
                .setBaseResultMap(true)
                .setBaseColumnList(true)
                .setFileOverride(true)
                .setEnableCache(false)
                // XML ResultMap
                .setBaseResultMap(true)
                // XML columList;
                .setBaseColumnList(true)
                // 设置时间类型使用哪个包下的
                .setDateType(DateType.ONLY_DATE)
                // 文件命名方式
//              .setMapperName(prefix + "Mapper");
//              .setEntityName(prefix + "Bean");
//              .setControllerName(prefix + "Controller");
//              .setServiceName(prefix + "Service");
                // 主键策略
                .setIdType(IdType.INPUT)
                //实体属性 Swagger2 注解
                .setSwagger2(isSwagger2);

        if (!serviceNameStartWithI) {
            config.setServiceName("%sService");
        }

        PackageConfig pcf = initPackage();

        TemplateConfig tc = initTemplateConfig(packageName);

        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(pcf)
                .setTemplate(tc)
                .execute();
    }

    /**
     * 根据自己的需要，修改哪些包下面的 要覆盖还是不覆盖
     *
     * @param packageName
     */
    private TemplateConfig initTemplateConfig(String packageName) {
        TemplateConfig tc = new TemplateConfig();
        for (String tmp : baseDir) {
            initVM(tc);
            String[] split = packageName.split(".");
            String[] c = packageNameC.split("/");
            String join = String.join("/", split);
            File file = new File(getOutputDir(projectName) + packageNameC);
            String[] list = file.list();
            if (list != null && list.length > 0) {
                if (!isOverController) {
                    tc.setController(null);
                }
                if (!isOverService) {
                    tc.setService(null);
                }
                if (!isOverServiceImpl) {
                    tc.setServiceImpl(null);
                }
                if (!isOverEntity) {
                    tc.setEntity(null);
                }
                if (!isOverMapper) {
                    tc.setMapper(null);
                }
                if (!isOverXml) {
                    tc.setXml(null);
                }
            }
        }
        return tc;
    }

    private void initVM(TemplateConfig tc) {
        if (stringIsNotNull(entityVM)) {
            tc.setEntity(entityVM);
        }
        if (stringIsNotNull(mapperVM)) {
            tc.setMapper(mapperVM);
        }
        if (stringIsNotNull(serviceImplVM)) {
            tc.setServiceImpl(serviceImplVM);
        }
        if (stringIsNotNull(serviceVM)) {
            tc.setService(serviceVM);
        }
        if (stringIsNotNull(xmlVM)) {
            tc.setXml(xmlVM);
        }
        if (stringIsNotNull(controllerVM)) {
            tc.setController(controllerVM);
        }
    }

    /**
     * 简单判断字符串是不是为空  **加粗文字**
     *
     * @param s
     * @return
     */
    private boolean stringIsNotNull(String s) {
        if (null != s && !s.equals("") && s.length() > 0 && s.trim().length() > 0) {
            return true;
        }
        return false;
    }

    /**
     * 初始化包目录配置
     *
     * @return
     */
    private PackageConfig initPackage() {
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setParent(packageName);
        packageConfig.setService(service);
        packageConfig.setServiceImpl(impl);
        packageConfig.setController(controller);
        packageConfig.setEntity(entity);
        packageConfig.setXml(xml);
        return packageConfig;
    }

    /**
     * 返回项目路径
     *
     * @param projectName 项目名
     * @return 项目路径
     * @author Terry
     */
    private String getOutputDir(String projectName) {
//        String path = this.getClass().getClassLoader().getResource("").getPath();
//        int index = path.indexOf(projectName);
        return projectName + "/src/main/java/";
    }
}

