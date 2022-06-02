package br.edu.ifpb;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.*;

public class servidorSignos implements ObjetoRemotosignos_IF {

    private Map<String, List<String>> mapadeSignos = new HashMap<String, List<String>>();
    private List<String> signos = new ArrayList<>();



    public servidorSignos(){

        signos.add("aries");
        signos.add("touro");
        signos.add("gemeos");
        signos.add("cancer");

        for(String s : signos){
            List<String> aux = new ArrayList<>();
            aux.add("Mensagem 1");
            aux.add("Mensagem 2");
            aux.add("Mensagem 3");
            aux.add("Mensagem 4");

            mapadeSignos.put(s, aux);

        }

        System.out.println(mapadeSignos);
    }


    @Override
    public String getMensagemSigno(String umSigno) throws RemoteException {


        Random r = new Random();

        return this.mapadeSignos.get(umSigno).get(r.nextInt(3));
    }










    public static void main(String[] args){

        try{

            servidorSignos Server = new servidorSignos();

            ObjetoRemotosignos_IF stub  = (ObjetoRemotosignos_IF) UnicastRemoteObject.exportObject(Server,0);
            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind("mensagem", stub);

            System.err.println("Servidor iniciado...");

        }catch (Exception e){
            System.out.println("Algo  errado não deu certo!");
        }




    }



}