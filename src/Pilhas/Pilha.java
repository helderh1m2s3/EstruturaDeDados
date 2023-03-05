package Pilhas;

public class Pilha {
    
    private NoPilha refEntradaPilha;

    public Pilha() {
        this.refEntradaPilha = null;
    }

    public boolean isEmpty() {
        if (refEntradaPilha == null) {
            return true;
        }
        return false;
    }

    public NoPilha top() {
        return refEntradaPilha;
    }

    public void push(NoPilha novoNoPilha) {
        NoPilha refAuxiliar = refEntradaPilha;
        refEntradaPilha = novoNoPilha;
        refEntradaPilha.setRefNo(refAuxiliar);
    }

    public NoPilha pop() {
        if (!this.isEmpty()) {
            NoPilha noPoped = refEntradaPilha;
            refEntradaPilha = refEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public String toString() {
        String stringRetorno = "---------------\n";
        NoPilha noAuxiliar = refEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "No {Dado = " + noAuxiliar.getDado() + "} \n";
                noAuxiliar = noAuxiliar.getRefNo();
            }else{
                break;
            }
        }
        return stringRetorno;
    }
}
