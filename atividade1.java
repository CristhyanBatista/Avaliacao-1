import java.util.Scanner;

public class SistemaEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] notas = new double[8]; // 8 notas do ano

        // Entrada das 8 notas
        System.out.println("Digite as 8 notas do aluno:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print((i + 1) + "ª Nota: ");
            notas[i] = sc.nextDouble();
        }

        // Cálculo das médias bimestrais
        double b1 = (notas[0] + notas[1]) / 2.0;
        double b2 = (notas[2] + notas[3]) / 2.0;
        double b3 = (notas[4] + notas[5]) / 2.0;
        double b4 = (notas[6] + notas[7]) / 2.0;

        // Cálculo das médias semestrais
        double s1 = (b1 + b2) / 2.0;
        double s2 = (b3 + b4) / 2.0;

        // Média final
        double mediaFinal = (s1 + s2) / 2.0;

        // Saída dos resultados
        System.out.println("\nPráticas");
        System.out.println("1º Bimestre: " + b1);
        System.out.println("2º Bimestre: " + b2);
        System.out.println("1º Semestre: " + s1);
        System.out.println("----------------------");
        System.out.println("3º Bimestre
