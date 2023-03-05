package Pilhas;

public class ProjetoNoPilha{
    public static void main(String[] args) {

        Pilha pilha01 = new Pilha();

        pilha01.push(new NoPilha(1));
        pilha01.push(new NoPilha(2));
        pilha01.push(new NoPilha(3));
        pilha01.push(new NoPilha(4));
        pilha01.push(new NoPilha(5));
        pilha01.push(new NoPilha(6));

        System.out.println(pilha01);

        System.out.println(pilha01.pop());
        System.out.println(pilha01);

        pilha01.push(new NoPilha(7));
        System.out.println(pilha01);


    }
}
