package banco;
import java.lang.Comparable;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{

    @Override
    public int compareTo(ContaPoupanca t) {
        if (this.getNumero() < t.getNumero()) {
            return -1;
        }
        if (this.getNumero() > t.getNumero()) {
            return 1;
        }
        return 0;   
    }
}
