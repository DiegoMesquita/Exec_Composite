package Calculadora;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public interface IExpressao {
	
	public int avaliar();
	public void add(IExpressao e) throws Exception;

}
