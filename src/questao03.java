import java.util.Scanner;

public class questao03 {
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

        // Mostrando o nome
        System.out.println("Olá "+nome);
        //ler.close();
    }
}
