package br.edu.ifpb;

/**
 * Hello world!
 *
 */

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.Set;

public class CitiesProcessorDemo {
    public static void main(String[] args) {


        CitiesProcessor ct = new CitiesProcessor();
        Set<City> set = ct.buildSetOfCities(Paths.get("/home/davi/Dropbox/Computação/Períodos e disciplinas/P2/Programação Orientada a Objetos/Práticas/Prática 7/proj-cities/src/main/java/br/edu/ifpb/files/cidades.txt"));
        ct.setCitiesSet(set);

        ComparatorByState comparatorByState = new ComparatorByState();

        ct.printaSet();

        ct.writeSetOfCities(Paths.get("/home/davi/Dropbox/Computação/Períodos e disciplinas/P2/Programação Orientada a Objetos/Práticas/Prática 7/proj-cities/src/main/java/br/edu/ifpb/files/destinocidade.txt"), comparatorByState);

        //ct.testarEscrita(Paths.get("/home/myrlla/pratica07/src/main/java/myrllalp/File/teste.txt"),comparatorByState);
        ct.writeSetOfCities(Paths.get("/home/davi/Dropbox/Computação/Períodos e disciplinas/P2/Programação Orientada a Objetos/Práticas/Prática 7/proj-cities/src/main/java/br/edu/ifpb/files/teste.txt"),comparatorByState);
    }
}
