import java.util.Scanner;

public class questao05 {
    public static void main(String[] args) throws Exception {
        //Criando Objeto de escanear
        Scanner ler = new Scanner(System.in);

        //Digitando o nome
        System.out.println("Digite o valor do jantar:");
        double jantar = ler.nextDouble();
        
        //Calculando a porcentagem do jantar
        double porcentagem = jantar/10;

        //Calculando o total com gorjeta
        double valortotal = jantar + porcentagem;

        // Mostrando as informações
        System.out.println("A gorjeta do garçom sai: "+porcentagem);
        System.out.println("O total a ser pago com a gorjeta: "+valortotal);
        ler.close();
            }
}
