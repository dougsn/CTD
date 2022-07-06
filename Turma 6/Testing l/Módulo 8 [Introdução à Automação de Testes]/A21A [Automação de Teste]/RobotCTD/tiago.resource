*** Variables ***
${SITE}                     https://www.saucedemo.com
${NAVEGADOR}                Chrome
${CAMPO_USUARIO}            css=#user-name
${USUARIO}                  standard_user
${CAMPO_SENHA}              css=#password
${SENHA}                    secret_sauce
${BOTAO_LOGIN}              css=#login-button
${ADICIONAR_CARRINHO}       css=#add-to-cart-sauce-labs-backpack
${CARRINHO}                 css=#shopping_cart_container > a
${BOTAO_CHECKOUT}           css=#checkout
${CAMPO_NOME}               css=#first-name
${NOME}                     Tiago
${CAMPO_SOBRENOME}          css=#last-name
${SOBRENOME}                Gomes
${CAMPO_CEP}                css=#postal-code
${CEP}                      123456
${BOTAO_CONTINUE}           css=#continue


*** Keywords ***
Acessar o site
  Open Browser      ${SITE}                 ${NAVEGADOR}
  Maximize Browser Window

Fazer login
  Input Text        ${CAMPO_USUARIO}        ${USUARIO}
  Input Text        ${CAMPO_SENHA}          ${SENHA}
  Click Element     ${BOTAO_LOGIN}

Adicionar um produto ao carrinho
  Click Element     ${ADICIONAR_CARRINHO}

Acessar o carrinho
  Click Element     ${CARRINHO}

Clicar em 'Checkout'
  Click Element     ${BOTAO_CHECKOUT}

Preencher informações do usuário
  Input Text        ${CAMPO_NOME}           ${NOME}
  Input Text        ${CAMPO_SOBRENOME}      ${SOBRENOME}
  Input Text        ${CAMPO_CEP}            ${CEP}
  Click Element     ${BOTAO_CONTINUE}