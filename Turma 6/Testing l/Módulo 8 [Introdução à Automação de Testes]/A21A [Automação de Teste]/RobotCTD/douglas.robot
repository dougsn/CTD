*** Settings ***

Library         SeleniumLibrary
Resource        ./douglas.resource  
Test Teardown   Close Browser    

*** Test Case *** 

Processo de compra da loja Sauce Demo
  Abrir o site da loja Sauce Demo
  Fazer login
  Adicionar um produto ao carrinho
  Acessar o carrinho
  Clicar em 'Checkout'
  Preencher informações do usuario