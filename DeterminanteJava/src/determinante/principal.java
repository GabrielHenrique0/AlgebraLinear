package determinante;
import java.util.Scanner;

// A classe Scanner tem como objetivo separar a entrada dos textos em blocos, gerando os conhecidos tokens, 
// que são sequências de caracteres separados por delimitadores que por padrão correspondem aos espaços em
// branco, tabulações e mudança de linha.

public class principal {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o tamanho da matriz: ");
        int n = scan.nextInt();
        int matriz[][] = new int[n][n];
        System.out.println("ingressar valores da matriz");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("mat[" + i + "][" + j + "]: ");
                matriz[i][j] = scan.nextInt();
            }
        }
        System.out.println("A determinante da matriz é: " + determinante.determinanteMatriz(matriz, n));
        scan.close();
    }
}