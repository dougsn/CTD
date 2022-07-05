*** Variables ***

${SITE}                             https://www.jouse.com.br
${NAVEGADOR}                        Chrome

${BOTAO_COMPRE_AGORA}               css=#__next > main > div > section:nth-child(2) > div.jss43 > div:nth-child(2) > a

${BOTAO_COR}                        css=#__next > main > div > div.jss77 > div.jss65 > div:nth-child(2) > div.jss82.jss84
${BOTAO_ACABAMENTO}                 css=#__next > main > div > div.jss77 > div.jss65 > div:nth-child(3) > div.jss82.jss84

${BOTAO_MODELO}                     css=#__next > main > div > div.jss77 > div.jss65 > div:nth-child(4) > div.jss75 > button:nth-child(2)
${BOTAO_SELECIONAR_PEDIDO}          css=#__next > main > div > div.jss77 > div.jss65 > div.jss76 > div.jss79 > button
${BOTAO_CONFIRMAR_PEDIDO}           css=#__next > main > div > div > div.jss162 > div > div.jss159 > a > button

${CAMPO_NOME}                       id=component-outlined-Nome
${NOME}                             Douglas
${CAMPO_SOBRENOME}                  id=component-outlined-Sobrenome
${SOBRENOME}                        Nascimento
${CAMPO_CPF}                        id=component-outlined-CPF
${CPF}                              15294640724
${CAMPO_EMAIL}                      id=component-outlined-E-mail
${EMAIL}                            douglassnascimet@gmail.com
${CAMPO_TELEFONE}                   id=component-outlined-Telefone
${TELEFONE}                         21982565216 
${CAMPO_CEP}                        id=component-outlined-CEP
${CEP}                              24744320
${CAMPO_CIDADE}                     id=component-outlined-Cidade
${CIDADE}                           São Gonçalo
${CAMPO_ESTADO}                     id=component-outlined-Estado
${ESTADO}                           RJ    
${CAMPO_ENDERECO}                   id=component-outlined-Endereço
${ENDERECO}                         Rua Teste teste
${CAMPO_NUMERO}                     id=component-outlined-Número
${NUMERO}                           21
${CAMPO_COMPLEMENTO}                id=component-outlined-Complemento
${COMPLEMENTO}                      Quadra 2
${CAMPO_CONTINUAR}                  css=#__next > main > div > div > section.jss175 > form > div.jss174 > button

${BOTAO_ENVIO_PADRAO}               css=#__next > main > div > div > section.jss198 > div.jss202 > div.jss206.jss214.jss211
${BOTAO_CONTINUAR}                  css=#__next > main > div > div > section.jss198 > div.jss197 > button

${BOTAO_CREDITO}                    css=#__next > main > div > div > section.jss219 > form > div.MuiPaper-root.MuiAccordion-root.jss236.jss216.MuiPaper-elevation0
${CAMPO_NUM_CARTAO}                 id=component-outlined-Número do cartão
${NUM_CARTAO}                       5170 1075 3003 0077
${CAMPO_VALIDADE}                   id=component-outlined-Validade
${VALIDADE}                         1223
${CAMPO_CVV}                        id=component-outlined-CVV
${CVV}                              548
${CAMPO_NOME_CARTAO}                id=component-outlined-Nome no cartão
${NOME_CARTAO}                      TESTE TESTE
${BOTAO_CONFIRMAR_PAGAMENTO}        css=#__next > main > div > div > section.jss219 > div.jss218 > button


*** Keywords ***

Acessar a loja da Jouse
    Open Browser            ${SITE}                 ${NAVEGADOR}
    Maximize Browser Window

Clicar em Compre agora
    Click Element           ${BOTAO_COMPRE_AGORA}

Selecionar uma cor e acabamento
    Click Element           ${BOTAO_COR}
    Click Element           ${BOTAO_ACABAMENTO}

Escolher um modelo, clicar em Selecionar e Confirmar pedido
    Click Element           ${BOTAO_MODELO}
    Click Element           ${BOTAO_SELECIONAR_PEDIDO}
    Click Element           ${BOTAO_CONFIRMAR_PEDIDO}

Preencher os dados para entrega e clicar em Continuar
    Input Text              ${CAMPO_NOME}           ${NOME}
    Input Text              ${CAMPO_SOBRENOME}      ${SOBRENOME}
    Input Text              ${CAMPO_CPF}            ${CPF}
    Input Text              ${CAMPO_EMAIL}          ${EMAIL}
    Input Text              ${CAMPO_TELEFONE}       ${TELEFONE}
    Input Text              ${CAMPO_CEP}            ${CEP}
    Input Text              ${CAMPO_CIDADE}         ${CIDADE}
    Input Text              ${CAMPO_ESTADO}         ${ESTADO}
    Input Text              ${CAMPO_ENDERECO}       ${ENDERECO}
    Input Text              ${CAMPO_NUMERO}         ${NUMERO}
    Input Text              ${CAMPO_COMPLEMENTO}    ${COMPLEMENTO}

    Click Element           ${BOTAO_CONTINUAR}

Selecionar uma forma de envio e clicar em Continuar
    Click Element           ${BOTAO_ENVIO_PADRAO}
    Click Element           ${BOTAO_CONTINUAR}

Selecionar a opção de Cartão de Crédito e preencher os dados
    Click Element           ${BOTAO_CREDITO}

    Input Text              ${CAMPO_NUM_CARTAO}       ${NUM_CARTAO}
    Input Text              ${CAMPO_VALIDADE}         ${VALIDADE}
    Input Text              ${CAMPO_CVV}              ${CVV}         
    Input Text              ${CAMPO_NOME_CARTAO}      ${NOME_CARTAO}

Finalizar a compra clicando em Confirmar
    Click Element ${BOTAO_CONFIRMAR_PAGAMENTO}