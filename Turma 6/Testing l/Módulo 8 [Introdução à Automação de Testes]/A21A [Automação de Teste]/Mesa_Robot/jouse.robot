*** Settings ***

Library     SeleniumLibrary
Resource    ./jouse.resource

*** Test Cases ***

Processo de compra de uma carteira Jouse
    Acessar a loja da Jouse
    Clicar em Compre agora
    Selecionar uma cor e acabamento
    Escolher um modelo, clicar em Selecionar e Confirmar pedido
    Preencher os dados para entrega e clicar em Continuar
    Selecionar uma forma de envio e clicar em Continuar
    Selecionar a opção de Cartão de Crédito e preencher os dados
    Finalizar a compra clicando em Confirmar
