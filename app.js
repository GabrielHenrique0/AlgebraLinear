const prompt = require('prompt-sync')();

var ordem = prompt("Digite a ordem da matriz: ")

var a = [];

// Inicia a matriz
for (var i = 0; i < ordem; i++){
    a[i] = []
    for (var j = 0; j < ordem; j++){
      a[i][j] = ''
    }
}

// Entrada dos números da matriz
for (var l = 0; l < ordem; l++){
    for (var c = 0; c < ordem; c++){
        a[l][c] = prompt('Digite o número de posição ' + '[' + (l+1) + ']' + '[' + (c+1) + ']' + ': ')
    }
}

// Formatação para printar a matriz
var a2 = ''
for (var l = 0; l < ordem; l ++){
    for (var c = 0; c < ordem; c++) {
        if (c < ordem - 1) {
            a2 += '[' + a[l][c] + ']\t'
        }
        else {
            a2 += '[' + a[l][c] + ']\n'
        }
    }
}

function determinante(a) {
    var ordem = a.length;

    if (ordem === 1) {
        return a[0][0];
    }

    if (ordem === 2) {
        return a[0][0] * a[1][1] - a[0][1] * a[1][0];
    }

    var det = 0;

    for (var j = 0; j < ordem; j++) {
        det += a[0][j] * cofator(a, 0, j);
    }

    return det;
}

function cofator(a, linha, coluna) {
    var sub_matriz = [],
        ordem = a.length,
        m = 0;

    for (var i = 1; i < ordem; i++) {
        sub_matriz[m] = [];

        for (var j = 0; j < ordem; j++) {
            if (j !== coluna) {
                sub_matriz[m].push(a[i][j]);
            }
        }
        m++;
    }
    return Math.pow(-1, linha + coluna) * determinante(sub_matriz);
}

// Saídas
console.log('\n' + 'Matriz:' + '\n' + a2)
console.log("Determinante: " + determinante(a))
