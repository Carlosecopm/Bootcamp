package poo;

import model.Cliente;
import model.Endereco;

import java.util.ArrayList;

public class EntregaCartao {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        //endereco.cep = "000000000";
            //dados endereço
        Cliente cliente = new Cliente();
         //dados cliente
        try {
            cliente.adicionaEndereco(endereco);
            System.out.println("Endereco cadastrado com sucesso");
        } catch (Exception e) {
           System.err.println("Houve um erro ao adicionar endederco: " + e.getMessage());
        }

    }

}
