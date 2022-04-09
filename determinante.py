import numpy as np

# Coleta do número de linhas e colunas
  
l = int(input("Digite o número de linhas: "))
c = int(input("Digite o número de colunas: "))

matriz = []
print("Digite os números da matriz: ")

for i in range(l):          # Armazena o número na linha
    a =[]
    for j in range(c):      # Armazena o número na coluna
         a.append(int(input()))
    matriz.append(a)
    
# Imprimindo a matriz
print("Sua matriz é: ")
for i in range(l):
    for j in range(c):
        print(matriz[i][j], end = " ")
    print()

# Calcula o determinante da matriz
det = np.linalg.det(matriz)

print("\nO determinante da matriz é:")
print(int(det))
