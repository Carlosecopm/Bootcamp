package lista.encadeada.model;

public class ListaEncadeada<T> {

    No<T> refEntadaLista;

    public ListaEncadeada() {
        this.refEntadaLista = null;
    }
    public boolean isEmpty() {
        return refEntadaLista == null ? true : false;
    }
    public int size() {
        int tamanhoLista = 0;
        No<T> auxiliar = refEntadaLista;
        while (true) {
            if (auxiliar != null) {
                tamanhoLista ++;
                if (auxiliar.getProximoNo() != null) {
                    auxiliar = auxiliar.getProximoNo();
                }else {
                    break;
                }
            }else {
                break;
            }
        }
        return tamanhoLista;
    }
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()) {
            refEntadaLista = novoNo;
            return;
        }
        No<T> auxiliar = refEntadaLista;
        for (int i = 0; i < this.size()-1; i++) {
            auxiliar = auxiliar.getProximoNo();
        }
        auxiliar.setProximoNo(novoNo);
    }
    private No<T> getNo(int index) {
        validaIndice(index);
        No<T> auxiliar = refEntadaLista;
        No<T> retorno = null;
        for(int i = 0; i <= index; i++) {
            retorno = auxiliar;
            auxiliar = auxiliar.getProximoNo();
        }
        return retorno;
    }
    private void validaIndice(int index){
        if (index >= size()) {
            throw new IndexOutOfBoundsException("Não existem conteúdo no índice" + index + "desta lista");
        }
    }
    public T get(int index) {
        return getNo(index).getConteudo();
    }
    public T remove(int index) {
        No<T> noPivor = this.getNo(index);
        if (index ==0 ) {
            refEntadaLista = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }
        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }

    @Override
    public String toString() {
        String retorno = " ";
        No<T> auxiliar = refEntadaLista;
        for(int i = 0; i < this.size(); i++) {
            retorno += "No[{" + "conteudo=" + auxiliar.getConteudo() + "}] --->";
            auxiliar = auxiliar.getProximoNo();
        }
        retorno = "null";
        return retorno;
    }
}

