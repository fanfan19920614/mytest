package utils;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JdbcUtils {

    public static Connection getConnection() throws ClassNotFoundException, IOException, SQLException {
         InputStream inputStream = JdbcUtils.class.getResourceAsStream("dbconfig.properties");
        //配置文件
         Properties properties = new Properties();
        //加载驱动 创建连接
        properties.load(inputStream);
        Class.forName(properties.getProperty("driverClassName"));
        Connection connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"), properties.getProperty("password"));
        return connection;
    }
}
