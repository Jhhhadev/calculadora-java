import java.util.Locale;
import java.util.Scanner;

public class calculadora {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        double valorUm;
        double valorDois;
        String operacao;
        boolean continuar;

     do {
         System.out.println("Digite o valor um: ");
         valorUm = scanner.nextDouble();

         System.out.println("Digite a operação");
         operacao = scanner.next();

         System.out.println("Digite o valor dois: ");
         valorDois = scanner.nextDouble();

         System.out.println("Resultado: " + realizarCalculo(valorUm, valorDois, operacao));

         continuar = verificarNovaOperacao();

     }while(continuar);


    }

    public static boolean verificarNovaOperacao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Deseja realizar uma nova operação? (S ou N)");
        return !sc.nextLine().toUpperCase(Locale.ROOT).equals("N");
    }

    public static Double realizarCalculo(Double valorUm, Double valorDois, String operacao){
        double resultadoCalculo = 0.0;

        switch (operacao){
            case "+":
                resultadoCalculo = valorUm + valorDois;
                break;

            case "-":
                resultadoCalculo = valorUm - valorDois;
                break;

            case "*":
                resultadoCalculo = valorUm * valorDois;
                break;

            case "/":
                resultadoCalculo = valorUm / valorDois;
                break;

            default:
                System.out.println("Operação inválida");
        }

        return resultadoCalculo;

    }
}
