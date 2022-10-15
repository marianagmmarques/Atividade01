import java.util.Scanner;

public class questao01 {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        //Criando Objeto de escanear
        Scanner ler = new Scanner(System.in);
        //Título
        System.out.println("Média do Aluno");
        //Nota 01 do aluno
        System.out.println("Digite a primeira nota:");
        //ler nota 01 digitada
        double nota01 = ler.nextDouble();
        //Nota 02 do aluno
        System.out.println("Digite a segunda nota:");
        //ler nota 02 digitada
        double nota02 = ler.nextDouble();
        //Calculando a média
        double media = (nota01 + nota02)/2;
        System.out.println("A média do aluno é: "+media);
        //Verificando se o aluno passou ou não 
        if (media>=7) {
            System.out.println("Parabéns: Aprovado!");
        } else {
            System.out.println("Infelizmente: Reprovado!");
        }
        ler.close();
    }
}
