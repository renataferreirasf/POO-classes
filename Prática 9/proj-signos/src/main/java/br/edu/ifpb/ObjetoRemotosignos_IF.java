package br.edu.ifpb;

import java.rmi.Remote;
import java.rmi.RemoteException;




public interface ObjetoRemotosignos_IF extends Remote{

    String getMensagemSigno(String umSigno) throws RemoteException;



}