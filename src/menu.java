import java.util.Scanner;

public class menu {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        String escolha = "";

        while(!escolha.equals("x")){
        System.out.println("Escolha a questão"); 
        System.out.println("a) Questão 00");
        System.out.println("b) Questão 01");
        System.out.println("c) Questão 02");
        System.out.println("d) Questão 03");
        System.out.println("e) Questão 04");
        System.out.println("f) Questão 05");
        System.out.println("g) Questão 06");
        System.out.println("x) Para encerrar");
        Scanner ler = new Scanner(System.in);
        escolha = ler.next();

        switch (escolha) {
            case "a":
                questao00.main(args);
                break;
            case "b":
                questao01.main(args);
                break;
            case "c":
                questao02.main(args);
                break;
            case "d":
                questao03.main(args);
                break;
            case "e":
                questao04.main(args);
                break;
            case "f":
                questao05.main(args);
                break;
            case "g":
                questao06.main(args);
                break;
            default:
                break;
        }
    }
    //ler.close();
    }
}
