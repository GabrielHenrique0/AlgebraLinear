package determinante;

public class determinante {
	
	// Cofator (álgebra)
	// Em álgebra linear, cofator ou complemento algébrico relativo a um elemento aij a um elemento de uma
	// matriz quadrada A de ordem n é o número Cij tal que Cij = (-1) i+j Aij, sendo Aij, o determinante da
	// matriz obtida a partir da matriz original A eliminando-se a linha e a coluna que contenham o elemento
	// aij;
	
	// A matriz dos cofatores C, matriz formada pelos respectivos cofatores dos elementos de uma matriz A
	// pode ser usada na determinação da matriz inversa A-1 de A
	static void obterCofator(int matriz[][], int temp[][], int p, int q, int n) {
        int i = 0, j = 0;
        for (int fila = 0; fila < n; fila++) {
            for (int coluna = 0; coluna < n; coluna++){
                if (fila != p && coluna != q){
                    temp[i][j++] = matriz[fila][coluna];
                    if (j == n - 1){
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    static int determinanteMatriz(int matriz[][], int n){
        int determinante = 0;
        if (n == 1){
            return matriz[0][0];
        }
        int temp[][] = new int[n][n];
        int multiplicador = 1;
        for (int f = 0; f < n; f++){
        	obterCofator(matriz, temp, 0, f, n);
            determinante += multiplicador * matriz[0][f] * determinanteMatriz(temp, n-1);
            multiplicador =- multiplicador;
        }
        return determinante;
    }
}
