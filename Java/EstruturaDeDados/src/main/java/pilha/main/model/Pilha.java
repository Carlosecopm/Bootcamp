package pilha.main.model;

public class Pilha {
    private No refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }
    public boolean isEmpty() {
        return refNoEntradaPilha == null ? true : false;
    }
    public No top() {
        return refNoEntradaPilha;
    }
    public void push(No novoNo) {
        No aux = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setProximo(aux);
    }
    public No pop() {
        if (!this.isEmpty()) {
            No noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getProximo();
            return noPoped;
        }
        return null;
    }

    @Override
    public String toString() {
        String stsringRetorno = "----------------\n";
        stsringRetorno += "  Pilha\n";
        stsringRetorno += "------------\n";
        No auxiliar = refNoEntradaPilha;
        while (true) {
            if (auxiliar != null) {
                stsringRetorno += "[No{dado=" + auxiliar.getDado() + "}]\n";
                auxiliar = auxiliar.getProximo();
            }else {
                break;
            }
        }
        stsringRetorno += "=============\n";
        return stsringRetorno;
    }
}
