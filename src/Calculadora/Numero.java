package Calculadora;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Numero implements IExpressao {
	private int n;
	
	public Numero(int n) {
		this.n = n;
	}
	
	public int avaliar() {
		return n;
	}

	@Override
	public void add(IExpressao e) throws Exception {
		throw new Exception();
		
	}
}
