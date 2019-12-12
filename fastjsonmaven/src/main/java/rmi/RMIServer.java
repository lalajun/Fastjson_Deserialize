package rmi;

import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {
    public interface IRemoteHelloWorld extends Remote {
        public String hello(String a) throws RemoteException;
    }

    public class RemoteHelloWorld extends UnicastRemoteObject implements IRemoteHelloWorld {
        protected RemoteHelloWorld() throws RemoteException {
            super();
            System.out.println("构造函数中");
        }

        public String hello(String a) throws RemoteException {
            System.out.println("call from");
            return "Hello world";
        }
    }

    private void start() throws Exception {
        RemoteHelloWorld h = new RemoteHelloWorld();
        LocateRegistry.createRegistry(1099);
        Naming.rebind("//127.0.0.1:1099/Hello", h);
    }

    public static void main(String[] args) throws Exception {
        new RMIServer().start();
    }
}