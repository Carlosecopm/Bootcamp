package listaCircular.model;

public class ListaCircular<T> {

    private No<T> cabeca;
    private No<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
    }

    public int size() {
        return this.tamanhoLista;
    }
    public boolean isEmpty() {
        return this.tamanhoLista == 0 ? true : false;
    }
    private No<T> getNo(int index) {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("A lista esta vazia");
        }
        if (index == 0) {
            return this.cauda;
        }
        No<T> auxiliar = this.cauda;
        for (int i = 0; (i < index) && (auxiliar != null); i++) {
            auxiliar = auxiliar.getProximo();
        }
        return auxiliar;
    }
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }
    public void remove(int index) {
        if (index >=this.tamanhoLista) {
            throw new IndexOutOfBoundsException("Indice maior que o tamanho da lista");
        }
        No<T> auxiliar = this.cauda;
        if (index == 0) {
            this.cauda = this.cauda.getProximo();
            this.cabeca.setProximo(this.cauda);
        }else if(index == 1){
            this.cauda.setProximo(this.cauda.getProximo().getProximo());
        }else {
            for (int i = 0; i < index - 1; i++) {
                auxiliar = auxiliar.getProximo();
            }
            auxiliar.setProximo(auxiliar.getProximo().getProximo());
        }
        this.tamanhoLista --;
    }
    public void add(T conteudo) {
        No<T> novoNo = new No<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = novoNo;
            this.cabeca.setProximo(this.cauda);
        }else {
            novoNo.setProximo(this.cauda);
            this.cabeca.setProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista ++;
    }

    @Override
    public String toString() {
        String strRetorno = " ";
        No<T> auxiliar = this.cauda;
        for (int i = 0; i < this.size(); i++) {
            strRetorno += "[No{conteudo=" + auxiliar.getConteudo() + "}]-->";
            auxiliar = auxiliar.getProximo();
        }

        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" : "[]";
        return strRetorno;
    }
}
