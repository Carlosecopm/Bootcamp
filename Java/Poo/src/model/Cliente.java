package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Pessoa{

    public String numCartao;
    private List<Endereco> enderecos;
    //public Endereco endereco;
    //public Endereco enderecoTrabalho;
    //public Endereco enderecoEntrega;


    //public void setEnderecos(List<Endereco> enderecos) {
      //  this.enderecos = enderecos;
    //}
    public void adicionaEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new NullPointerException("Endereco nao pode ser vazio");
        }
        if (endereco.cep == null) {
            throw new NullPointerException("Cep nao pode ser vazio");
        }
        getEnderecos().add(endereco);
    }
    public List<Endereco> getEnderecos() {
        if (enderecos == null) {
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }
}
