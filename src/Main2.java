import java.io.IOException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int qtdAlunos = scanner.nextInt();
        System.out.println("Digite a quantidade de notas: ");
        int qtdNotas = scanner.nextInt();

        double[][] notas = new double[qtdAlunos][qtdNotas];

        for(int i = 0; i < notas.length; i++) {
            System.out.printf("Digite as notas referente ao aluno %d ", i);
            for (int j = 0; j < qtdNotas; j++) {
                System.out.printf("Digite a nota %d", j);
                notas[i][j] = scanner.nextDouble();
            }
        }
        try {
            System.out.println("Nota do aluno x: " + notas[0][2]);
        } catch (Exception exception) {
            System.out.println("Ops... Nota do aluno não encontrada");
        }
        OpenFile openFile = new OpenFile();
        openFile.abrirArquivo();

        System.out.println("Pós error...");
    }
}