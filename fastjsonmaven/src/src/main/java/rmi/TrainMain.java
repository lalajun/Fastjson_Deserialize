package rmi;

import java.rmi.Naming;
import java.rmi.NotBoundException;

public class TrainMain {
    public static void main(String[] args) throws Exception {
        RMIServer.IRemoteHelloWorld hello = (RMIServer.IRemoteHelloWorld) Naming.lookup("rmi://127.0.0.1:1099/Hello");
        String ret = hello.hello("input!gogogogo");
        System.out.println( ret);
    }
}
