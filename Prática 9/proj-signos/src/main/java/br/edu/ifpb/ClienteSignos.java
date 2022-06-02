package br.edu.ifpb;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteSignos {


    public static void main(String[] args) {

        String host = (args.length < 1) ? "localhost" : args[0];
        Scanner scanner = new Scanner(System.in);


        try{

            String signo;


            Registry registry = LocateRegistry.getRegistry(host);
            ObjetoRemotosignos_IF stub = (ObjetoRemotosignos_IF) registry.lookup("mensagem");

            signo = scanner.nextLine();


            System.out.println(stub.getMensagemSigno(signo));

        }catch (Exception e){
            System.out.println("Erro ai!");
        }




    }



}