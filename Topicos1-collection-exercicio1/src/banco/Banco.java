package banco;

import java.util.ArrayList;

/*
Criar uma classe Banco que possui uma lista de objetos do tipo Conta e um atributo nome.
Deve-se tomar cuidado, pois, numa lista de contas, pode-se inserir tanto objetos do tipo
ContaCorrente  quanto ContaPoupanca.
 */
public class Banco {
    
    public Banco(){
        ArrayList<Conta> lista = new ArrayList<Conta>();
        String nome;
    }
    
    void adiciona(Conta c){
    //Adiciona a conta na lista de Contas
    }
    Conta getConta(Integer numero){
    //Retorna a Conta de acordo com o numero
    }
    Integer getNumeroContas(ArrayList<Conta> lista){
    //Retorna o numero de contas abertas no banco
        Integer qtdConta = 0;
        for(Conta c : lista){
            qtdConta ++;
        }
        return qtdConta;
    }
    
    //TODO Colocar Integer
    Double getSaldoContas(ArrayList<Conta> lista){
    //Retorna a soma do saldo de todas as contas
        Double saldo = 0.0;
        for(Conta c : lista){
            saldo += c.getSaldo();
        }
        return saldo;
    }
    boolean fecharConta(Integer numero){
    //Fecha uma conta com base em seu numero removendo-a da lista de contas
    }
    boolean fecharConta(Conta conta){
    //Fecha a conta recebida por parâmetro removendo-a da lista de contas
    return;
    }
    void imprimirListagemContas(){
    //Imprime a listagem de contas. Obs.: Implementar e utilizar o método toString da classe Conta.
    }
    
    
}