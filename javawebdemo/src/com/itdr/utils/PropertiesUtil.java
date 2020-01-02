package com.itdr.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    static String className;
    static Properties p;
    static {
        p = new Properties();
        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("st.properties");
        try {
            p.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getValue(String className) {
        className=p.getProperty("className");
        return className;
    }

}
