package Calculadora;
/**
 *
 * @author Diego Mesquita, diego.mesquita@dce.ufpb.br
 * 
 */
public class Main {

    public static void main(String[] args) {

        Soma soma = new Soma();
        Multiplicacao mult = new Multiplicacao();
        Subtracao sub = new Subtracao();
        Divisao div = new Divisao();
        Numero n1 = new Numero(1);
        Numero n3 = new Numero(3);
        Numero n5 = new Numero(5);
        Numero n7 = new Numero(7);
        Numero n10 = new Numero(10);
        Numero n12 = new Numero(12);
        Numero n15 = new Numero(15);

        soma.add(n7);
        soma.add(n1);//8 +
        mult.add(n10);
        mult.add(n7);//70 +
        div.add(n15);
        div.add(n3);//5 +
        sub.add(n12);
        sub.add(n7);//5 = 88
        soma.add(mult);
        soma.add(div);
        soma.add(sub);
                        
        System.out.println(soma.avaliar());
    }
}
