package fila.model;


public class Fila<T> {
    private No<T> refNoEntada;

    public Fila() {
        this.refNoEntada = null;
    }
    public boolean isEmpty() {
        return refNoEntada == null? true : false;
    }
    public void enqueue(T obj) {
        No novoNo = new No(obj);
         novoNo.setRefNo(refNoEntada);
        refNoEntada = novoNo;
    }
    public T first() {
        if (!this.isEmpty()) {
           No primeiro = refNoEntada;
           while (true) {
                if (primeiro.getRefNo() != null) {
                    primeiro = primeiro.getRefNo();
                }else {
                    break;
                }
           }
           return (T) primeiro.getObject();
        }
        return null;
    }
    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiro = refNoEntada;
            No auxiliar = refNoEntada;
            while (true) {
                if (primeiro.getRefNo() != null) {
                    auxiliar = primeiro;
                    primeiro = primeiro.getRefNo();
                }else {
                    auxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiro.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = " ";
        No auxiliar = refNoEntada;

        if (refNoEntada != null) {
            while (true) {
                stringRetorno += "[ No{objeto=" + auxiliar.getObject() + "}]---->";

                if (auxiliar.getRefNo() != null) {
                    auxiliar = auxiliar.getRefNo();
                }else {
                    stringRetorno += "null";
                    break;
                }
            }
        }else {
            stringRetorno = null;
        }
        return stringRetorno;
    }
}
