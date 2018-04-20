package banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Criar uma classe chamada TesteContaCorrente onde deve-se criar um método main
public class TesteContaCorrente2 {
    public static void main(String[] args){
        //Declaração de uma variável para representar uma lista de ContaCorrente
        Set<ContaCorrente> lista = new HashSet<ContaCorrente>();

        //Criação de 3 contas adicionadas a lista;
        ContaCorrente cc1 = new ContaCorrente();
        cc1.setSaldo(200.0);
        cc1.setNumero(2);
        cc1.setTitular("Fulano da Silva");
        
        ContaCorrente cc2 = new ContaCorrente();
        cc2.setSaldo(600.0);
        cc2.setNumero(3);
        cc2.setTitular("Beltrano Lima");
        
        ContaCorrente cc3 = new ContaCorrente();
        cc3.setSaldo(2000.0);
        cc3.setNumero(1);
        cc3.setTitular("Ciclano de Souza");
        
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);

        //Impressão da lista desordenada, utilizando o método exibirContas
        exibirContas(lista);
        
        //Ordenação da lista, utilizando como critério o titular, sem alterar a classe original

        //Impressão da lista ordenada, utilizando o método exibirContas
        exibirContas(lista);
    }
    
    //Criação de um método static chamado exibirContas(List) para fazer a impressão da lista exibindo,numero, titular e saldo para cada conta;
    public static void exibirContas(Set<ContaCorrente> lista){
        for(ContaCorrente cc : lista){
            System.out.println(cc.getNumero()+","+cc.getTitular()+","+cc.getSaldo());
        }
    }
}