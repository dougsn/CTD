*** Settings ***
Library             SeleniumLibrary
Resource            ./douglas.resource
Test Teardown       Close Browser

*** Test Case ***
Processo de compra na loja Sauce Demo
  Acessar o site
  Fazer login
  Adicionar um produto ao carrinho
  Acessar o carrinho
  Clicar em 'Checkout'
  Preencher informações do usuário