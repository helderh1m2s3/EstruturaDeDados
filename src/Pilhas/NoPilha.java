package Pilhas;

public class NoPilha {

    private int dado;
    private NoPilha refNO = null;

    public NoPilha() {
    }
    
    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getRefNo() {
        return refNO;
    }

    public void setRefNo(NoPilha refNo){
        this.refNO = refNo;
    }

    public String toString() {
        return "No { " + "Dado = " + dado + " }";
    }
}
