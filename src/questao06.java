import java.util.Scanner;

public class questao06 {
    public static void main(String[] args) throws Exception {
        //Criando Objeto de escanear
        Scanner ler = new Scanner(System.in);

        //Digitando valor
        System.out.println("Qual o valor total da comanda?");
        double comanda = ler.nextDouble();

        //Digitando quantas pessoas vão pagar
        System.out.println("Quantas pessoas vão pagar?");
        int qntpessoas = ler.nextInt();

        //Calculando o resultado
        double resultado = comanda / qntpessoas;
        
        //Apresentando o resultado na tela
        System.out.println("Cada pessoa irá pagar: "+resultado+" reais!");
        ler.close();
    }
}
