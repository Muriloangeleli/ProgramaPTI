import java.util.Scanner;

public class ProgramaPTI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros deseja armazenar na sua lista?");
        int N = sc.nextInt();
        System.out.println("Digite os numeros da sua lista:");
        int[] vetor = new int[N];
        for (int i = 0; i < N; i++) {
            int numeros = sc.nextInt();
            vetor[i] = numeros;
        }
        System.out.println("A) A diferença entre o maior e o menor número da sua lista é: " + diferenca(vetor, N));
        System.out.println();
        System.out.println("B) Sua lista esta em ordem crescente?");
        if (crescente(vetor, N) == 1) {
            System.out.println("Verdadeiro!");
        } else
            System.out.println("Falso!");
        sc.close();
    }

    static int diferenca(int[] vetor, int N) {
        int diferenca = 0;
        int maior = vetor[0];
        for (int i = 0; i < N; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        int menor = vetor[0];
        for (int i = 0; i < N; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return diferenca = maior - menor;
    }

    static int crescente(int[] vetor, int N) {
        for (int i = 1; i < N; i++) {
            if (vetor[i - 1] > vetor[i]) {
                return 0;
            }
        }
        return 1;
    }
}