package banco;
import java.lang.Comparable;

public class ContaCorrente extends Conta implements Comparable<ContaCorrente>{

    @Override
    public int compareTo(ContaCorrente t) {
        if (this.getSaldo() < t.getSaldo()) {
            return -1;
        }
        if (this.getSaldo() > t.getSaldo()) {
            return 1;
        }
        
        /*if(this.getSaldo() == t.getSaldo()){
            if (this.getTitular() < t.getTitular()) {
            return -1;
        }else {
            return 1;
            }
        }*/
        return 0;   
    }
}
