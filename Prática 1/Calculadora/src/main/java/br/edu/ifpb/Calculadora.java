package br.edu.ifpb;

public class Calculadora {
    private String descrição;
    private double memoria;

    public Calculadora() {
        this.descrição = "Calculadora em Java";
        this.memoria = 0;
    }

    public Calculadora(String descrição, double memoria) {
        this.descrição = descrição;
        this.memoria = memoria;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public double somar(double N1, double N2){
        setMemoria(N1+N2);
        return getMemoria();
    }
    public double subtrair(double N1, double N2){
        setMemoria(N1-N2);
        return getMemoria();
    }
    public double multiplicar(double N1, double N2){
        setMemoria(N1*N2);
        return getMemoria();
    }
    public double dividir(double N1, double N2){
        setMemoria(N1/N2);
        return getMemoria();
    }
}
