// Pedra ganha de Tesoura.
// Tesoura ganha de Papel.
// Papel ganha de Pedra.



// let robo = parseInt(Math.random() * 3 + 1);


let contadorPessoa = 0;
let contadorRobo = 0;

while (contadorRobo < 2 && contadorPessoa < 2) {
  let escolhaPessoa = parseInt(prompt("Digite o número que você escolheu: \n1 - Pedra \n2 - Papel \n3 - Tesoura "));
  alert("Você escolheu " + escolhaPessoa);

  let maquina = Math.floor(Math.random() * 3) + 1;
  alert("O Robô escolheu " + maquina);

  switch (escolhaPessoa) {
    
    case 1:
      if (maquina == 2) contadorRobo++;
      else if (maquina == 3) contadorRobo++;
      break;
    case 2:
      if (maquina == 3) contadorRobo++;
      else if (maquina == 1) contadorPessoa++;
      break;
    case 3:
      if (maquina == 1) contadorPessoa++;
      else if (maquina == 2) contadorPessoa++;
      break;
    
  }

  alert("Seus pontos: " + contadorPessoa + "\nPontos do Robô: " + contadorRobo);
}


 alert(contadorRobo > contadorPessoa ? "Robô ganhou" : "Você ganhou!");
