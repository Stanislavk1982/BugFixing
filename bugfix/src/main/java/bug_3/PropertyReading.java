package bug_3;

import bug_1.CustomEnum;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyReading {
    public static void main(String[] args) throws IOException {
        String username = "admin";
        String password = "1234";

        Properties properties = new Properties();
        InputStream inputStream = CustomEnum.class.getResourceAsStream("/bug_2/credentials.properties");//please use relative path, not absolute
        properties.load(inputStream);
        String adminUserName = properties.getProperty("username");
        final String adminPassword = properties.getProperty("password");

        System.out.println("adminUserName:"+adminUserName);
        System.out.println("adminPassword:"+adminPassword);
        System.out.println("should be the same: " + username.equals(adminUserName));
        System.out.println("should be the same: " + password.equals(adminPassword));
    }
}
