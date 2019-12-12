package jndi注入;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.server.UnicastRemoteObject;

public class Server_User {

    public interface User extends Remote {
        public String name(String name) throws RemoteException;
        public void say(String say) throws RemoteException;
        public void dowork(Object work) throws RemoteException;
    }

    public static class UserImpl extends UnicastRemoteObject implements User{

        protected UserImpl() throws RemoteException{
            super();
        }
        public String name(String name) throws RemoteException{
            return name;
        }
        public void say(String say) throws  RemoteException{
            System.out.println("you speak" + say);
        }
        public void dowork(Object work) throws  RemoteException{
            System.out.println("your work is " + work);
        }
    }

    public static void main(String[] args) throws Exception{
        String url = "rmi://127.0.0.1:1099/aa";
        UserImpl user = new UserImpl();
        LocateRegistry.createRegistry(1099);
        Naming.bind(url,user);
        System.out.println("the rmi is running ...");
    }
}

