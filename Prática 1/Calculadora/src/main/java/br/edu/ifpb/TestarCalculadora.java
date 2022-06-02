package br.edu.ifpb;

/**
 * Hello world!
 *
 */
public class TestarCalculadora
{
    public static void main( String[] args )
    {
        MenuCalculadora TestCal = new MenuCalculadora();

        while (true){
            TestCal.exibirMenu();
            int m = TestCal.getMenu();
            if (m == 6){
                break;
            }
            else if (m == 1){
                double[] n = TestCal.getNumeros();
                TestCal.Cal.somar(n[0],n[1]);
                System.out.println(TestCal.Cal.getMemoria());
            }
            else if (m == 2){
                double[] n = TestCal.getNumeros();
                TestCal.Cal.subtrair(n[0],n[1]);
                System.out.println(TestCal.Cal.getMemoria());
            }
            else if (m == 3){
                double[] n = TestCal.getNumeros();
                TestCal.Cal.multiplicar(n[0],n[1]);
                System.out.println(TestCal.Cal.getMemoria());
            }
            else if (m == 4){
                double[] n = TestCal.getNumeros();
                TestCal.Cal.dividir(n[0],n[1]);
                System.out.println(TestCal.Cal.getMemoria());
            }
            else if (m == 5){
                System.out.println(TestCal.Cal.getDescrição());
            }
        }
    }
}
