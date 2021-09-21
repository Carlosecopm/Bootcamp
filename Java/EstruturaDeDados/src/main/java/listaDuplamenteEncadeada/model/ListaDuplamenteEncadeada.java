package listaDuplamenteEncadeada.model;

public class ListaDuplamenteEncadeada<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;

    public ListaDuplamenteEncadeada() {
        this.tamanhoLista = 0;
        this.primeiroNo = null;
        this.ultimoNo = null;
    }

    public int size() {
        return this.tamanhoLista;
    }

    private NoDuplo<T> getNo(int index) {
        NoDuplo<T> auxiliar = primeiroNo;
        for (int i = 0; (i < index) && (auxiliar != null); i ++ ) {
            auxiliar = auxiliar.getNoProximo();
        }
        return auxiliar;
    }
    public T get(int index) {
        return this.getNo(index).getConteudo();
    }
    public void add(T elemento) {
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoAnterior(ultimoNo);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
        }
        if (ultimoNo != null) {
            ultimoNo.setNoProximo(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista ++;
    }
    public void add(int index, T elemento) {
        NoDuplo<T> auxiliar = getNo(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(auxiliar);
        if (novoNo.getNoProximo() != null) {
            novoNo.setNoAnterior(auxiliar.getNoAnterior());
            novoNo.getNoProximo().setNoAnterior(novoNo);
        }else {
            novoNo.setNoAnterior(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0) {
            primeiroNo = novoNo;
        }else {
            novoNo.getNoAnterior().setNoAnterior(novoNo);
        }
        this.tamanhoLista ++;
    }
    public void remove(int index) {
        if (index == 0) {
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null) {
                primeiroNo.setNoAnterior(null);
            }
        }else {
            NoDuplo<T> auxiliar = getNo(index);
            auxiliar.getNoAnterior().setNoProximo(auxiliar.getNoProximo());
            if (auxiliar != ultimoNo) {
                auxiliar.getNoProximo().setNoAnterior(auxiliar.getNoAnterior());
            }else {
                ultimoNo = auxiliar;
            }
        }
        this.tamanhoLista --;
    }

    @Override
    public String toString() {
        String strRetorno = " ";
        NoDuplo<T> auxiliar = primeiroNo;
        for (int i = 0; i < size(); i++) {
            strRetorno += "[No{conteudo=" + auxiliar.getConteudo() + "}]-->";
            auxiliar = auxiliar.getNoProximo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
