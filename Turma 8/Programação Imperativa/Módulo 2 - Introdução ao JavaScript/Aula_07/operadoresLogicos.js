


/* =========================
ARITMÉTICOS
========================= */


// Nos permitem fazer operações matemáticas

10 + 15 // -----> Soma
10 - 15 // -----> Subtração
10 * 15 // -----> Multiplicação
10 / 15 // -----> Divisão
15++    // -----> Incremento de um em um: 15 + 1
15 --   // -----> Decremento de um em um: 15 - 1
15 % 5  // -----> Módulo. O resto obtido da divisão de 15 por 5: 0 (PAR)
15 % 2  // -----> Módulo. O resto obtido da divisão de 15 por 2: 1 (IMPAR)



/* =========================
COMPARAÇÃO SIMPLES
========================= */

// Comparam dois valores, devolvem verdadeiro ou falso

10 == 15 // -----> Igualdade -> false
10 != 15 // -----> Desigualdade -> true


/* =========================
COMPARAÇÃO ESTRITA
========================= */

// Comparam os valores e o tipo de dado também, devolvem verdadeiro ou falso


10 === 15 // -----> Igualdade estrita -> false
10 !== 15 // -----> Desigualdade estrita-> true



/* =========================
OPERADORES RELACIONAIS
========================= */


15 > 15     // -----> Maior que -> false
15 >= 15    // -----> Maior ou igual a -> true
10 < 15     // -----> Menor que -> true
10 <= 15    // -----> Menor ou igual a -> true


/* =========================
LÓGICOS
========================= */

// Permitem combinar valores booleanos e seu resultado ao mesmo tempo, também é um booleano. E existem 3 operadores e (AND), ou (OR) e negação (NOT)

// AND(&&) -> todos os valores devem ser avaliados como true(verdadeiro) para que o resultado seja verdadeiro

(10 > 15) && (10 !=20)      //false (AND) 
(12 % 4 == 0) && (12 != 24) //true (AND) 

// OR(||) -> ao menos um valor deve ser avaliado como true para que o resultado seja true

(10 > 15) || (10 != 20)     // true
(12 % 5 == 0) || (12 != 12) //false

//NOT(!) -> nega a condição. Se era true, será false e vice-versa.

!false // true
!(20 > 15) // false

