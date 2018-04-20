package banco;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Criar uma classe chamada TesteContaPoupanca onde deve-se criar um método main
public class TesteContaPoupanca {
    public static void main(String[] args){
        //Declaração de uma variável para representar uma lista de ContaPoupanca
        Set<ContaPoupanca> lista = new HashSet<ContaPoupanca>();

        //Criação de 3 contas adicionadas a lista;
        ContaPoupanca cp1 = new ContaPoupanca();
        cp1.setSaldo(200.0);
        cp1.setNumero(2);
        cp1.setTitular("Fulano da Silva");
        
        ContaPoupanca cp2 = new ContaPoupanca();
        cp2.setSaldo(600.0);
        cp2.setNumero(3);
        cp2.setTitular("Beltrano Lima");
        
        ContaPoupanca cp3 = new ContaPoupanca();
        cp3.setSaldo(2000.0);
        cp3.setNumero(1);
        cp3.setTitular("Ciclano de Souza");
        
        lista.add(cp1);
        lista.add(cp2);
        lista.add(cp3);

        
        //Impressão da lista desordenada;
        for(ContaPoupanca cp : lista){
            System.out.println(cp.getNumero()+","+cp.getTitular()+","+cp.getSaldo());
        }
        
        //Ordenação da lista;


        //Impressão da lista ordenada.
        for(ContaPoupanca cp : lista){
            System.out.println(cp.getNumero()+","+cp.getTitular()+","+cp.getSaldo());
        }
    }
}