public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        double[][] notas = { {8, 7, 9, 5.5}, {10, 10, 9.5, 8.5}, {5, 4.5, 6, 7} };

        for (int i = 0; i < notas.length; i++) {
            System.out.printf("\n\n Notas do aluno %d:", i+1);

            for (int j = 0; j < notas[i].length; j++) {
                System.out.printf("\n Nota: %.2f", notas[i][j]);
            }
//            System.out.printf("\n Nota: %.2f", notas[i][0]);
//            System.out.printf("\n Nota2: %.2f", notas[i][1]);
//            System.out.printf("\n Nota3: %.2f", notas[i][2]);
//            System.out.printf("\n Nota4: %.2f", notas[i][3]);
        }

//        System.out.println("Notas do João: ");
//        double nota = notas[0][0];
//        double nota2 = notas[0][1];
//        double nota3 = notas[0][2];
//        double nota4 = notas[0][3];
//        double media = (nota + nota2 + nota3 + nota4 )/4;
//        System.out.printf("Nota 1: %.2f - Nota2: %.2f - Nota3: %.2f - Nota4: %.2f", nota, nota2, nota3, nota4);
//        System.out.printf(" Média: %.2f", media);
    }
}