import java.util.Scanner;

public class questao04 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Criando Objeto de escanear
        Scanner ler = new Scanner(System.in);

        //Digitando o nome
        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        //Digitando o valor 
        System.out.println("Digite seu salário por hora recebido:");
        double salario = ler.nextDouble();

        //Digitando quantas horas trabalhou
        System.out.println("Quantas horas você trabalhou?");
        int hora = ler.nextInt();

        //Calculando o resultado
        double resultado = salario*hora;
        
        // Mostrando as informações
        System.out.println(""+nome+" você vai receber R$"+resultado);
        //ler.close();
    }
}