package NosGenerics;

import Pilhas.NoPilha;

public class ProjetoNo{
    public static void main(String[] args) {

        NoPilha<String> no1 = new NoPilha<>("Conteudo NO1");
        NoPilha<String> no2 = new NoPilha<>("Conteudo NO2");
        no1.setProximoNo(no2);
        NoPilha<String> no3 = new NoPilha<>("Conteudo NO3");
        no2.setProximoNo(no3);
        NoPilha<String> no4 = new NoPilha<>("Conteudo NO4");
        no3.setProximoNo(no4);
        no4.setProximoNo(null);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);



        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());

    }
}
