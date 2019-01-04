package com.bwjf;

import com.bwjf.entity.User;
import com.bwjf.service.UserService;
import com.bwjf.service.impl.UserServiceImpl;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {

       /* List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("D:\\IDEA_WorkSpace\\testA\\src\\mbg.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);*/
        UserService userService  =new UserServiceImpl();
        User user = userService.findByUsername("1234");
        System.out.println(user);

    }
}
