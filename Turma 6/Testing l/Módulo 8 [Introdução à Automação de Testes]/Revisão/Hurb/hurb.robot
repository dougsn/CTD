*** Settings ***

Library         SeleniumLibrary
Resource        ./hurb.resource
Test Setup      Abrir o site do Hurb
#Test Teardown   Close Browser


*** Test Cases ***

Processo de reserva de pacote de viagens
  Clicar em “Permitir todos os cookies”
  Selecionar a opção “Pacotes”
  Buscar por alguma cidade turística (Ex: Buenos Aires, Florença, Orlando) e clicar em “Pesquisar”
  Selecionar um pacote de viagem
  Clicar em “Escolher pacote”
  Selecionar as opções do pacote e clicar em “Ir para pagamento”
  Validar as informações da “Configuração” da viagem
  Validar as informações do período da viagem
  Selecionar a opção “Boleto parcelado” (se não estiver disponível, escolha qualquer outro)
  Preencher os dados de pagamento
  Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Validar a informação sobre cancelamento grátis
