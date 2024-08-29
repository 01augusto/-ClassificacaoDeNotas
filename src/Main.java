import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 1. Crie uma variável para armazenar a nota de um aluno (de 0 a 10)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a nota do aluno: ");
        double nota = scanner.nextDouble();

        // 2. Usando condições encadeadas, classifique a nota
        if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 7) {
            System.out.println("Bom");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Insatisfatório");
        }
    }
}