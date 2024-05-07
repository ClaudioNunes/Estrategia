// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora( new Multiplicacao() );

        calculadora.setA(10);
        calculadora.setB(5);

        System.out.println("Resultado 1:" + calculadora.Calculo());
        calculadora.setOper(new Adicao());
        System.out.println("Resultado 2 :" + calculadora.Calculo());

    }
}