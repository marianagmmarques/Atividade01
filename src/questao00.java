import java.util.Scanner;

public class questao00 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //nome, idade, altura, sexo
        Scanner ler = new Scanner(System.in);

    System.out.println("Digite seu nome:");
    String nome = ler.nextLine();

    System.out.println("Digite seu idade:");
    int idade = ler.nextInt();

    System.out.println("Digite seu altura:");
    float altura = ler.nextFloat();

    System.out.println("Digite seu sexo:");
    char sexo = ler.next().toCharArray()[0];

    System.out.println("Olá "+nome+" você tem "+idade+" anos, tem "+altura+" de altura e seu gênero é "+sexo);
    
    System.out.println("---------------------------------");

    // Quantas copas essa pessoa já viu vencer?
    //Anos 58,62,70,94 e 2002
    System.out.println("Digite seu idade:");
    int idade1 = ler.nextInt();
    //ler.close();

    int anoNascimento = 2022 - idade1;

    int qtdCopas = 0;

    String listaCopas = "";

    if(anoNascimento <= 1958){
        qtdCopas++;
        listaCopas +=" 1958";
    }
    if (anoNascimento <= 1962) {
        qtdCopas++;
        listaCopas +=" 1962";
    }
    if (anoNascimento <= 1970) {
        qtdCopas++;
        listaCopas +=" 1970";
    }
    if (anoNascimento <= 1994) {
        qtdCopas++;
        listaCopas +=" 1994";
    }
    if (anoNascimento <= 2002) {
        qtdCopas++;
        listaCopas +=" 2002";
    }
    System.out.println("Quantidade de Copas que vi o Brasil ganhar: "+qtdCopas+" ano(s): "+listaCopas);
    }
}
