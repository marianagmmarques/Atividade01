import java.util.Scanner;

public class questao02 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Criando Objeto de escanear
        Scanner ler = new Scanner(System.in);

        //Titulo
        System.out.println("Incrementar e Decrementar");

        //Digitando o número
        System.out.println("Digite um número qualquer meu caro: ");

        //Lendo o número
        int numero = ler.nextInt();

        //Mostrando o número digitado
        System.out.println("Seu número foi: "+numero);

        //Incrementado um número
        System.out.println("Incrementando: "+(numero += 1));
        
        //Decrementando 2 números o incremente + digitado
        System.out.println("Decrementar: "+(numero -= 2));
        //ler.close();
    }
}
