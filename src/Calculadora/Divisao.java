package Calculadora;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Divisao implements IExpressao {

    private List<IExpressao> num = new ArrayList<IExpressao>();

    public void add(IExpressao n) {
        num.add(n);
    }

    public int avaliar() {
        int result = num.get(0).avaliar();
        for (int i = 1; i < num.size(); i++) {
            result /= num.get(i).avaliar();
        }
        return result;
    }
}
