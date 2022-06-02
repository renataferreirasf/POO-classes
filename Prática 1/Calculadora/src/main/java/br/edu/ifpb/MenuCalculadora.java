package br.edu.ifpb;

import java.util.Scanner;

public class MenuCalculadora {

    /*public MenuCalculadora() {
        exibirMenu();
    }*/

    public void exibirMenu(){
        System.out.println("Calculadora");
        System.out.println("=====================");
        System.out.println("1.Somar");
        System.out.println("2.Subtrair");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Sobre a Calculadora");
        System.out.println("6.Sair");
        System.out.println("Digite uma Opção");
    }
    public int getMenu() {
        Scanner scm = new Scanner(System.in);
        return scm.nextInt();
    }

    public double[] getNumeros(){
        Scanner sc = new Scanner(System.in);
        double[] n = new double[2];
        System.out.println("Digite o Primeiro Número");
        n[0] = sc.nextDouble();
        System.out.println("Digite o Segundo Número");
        n[1] = sc.nextDouble();
        return n;
    }
    Calculadora Cal = new Calculadora();
}
