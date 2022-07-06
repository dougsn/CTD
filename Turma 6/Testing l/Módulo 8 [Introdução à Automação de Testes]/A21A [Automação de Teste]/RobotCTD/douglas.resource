*** Variable ***
${SITE}                     https://www.saucedemo.com 
${NAVEGADOR}                Chrome
${CAMPO_USUARIO}            id=user-name
${USUARIO}                  standard_user
${CAMPO_PASSWORD}           id=password
${PASSWORD}                 secret_sauce
${BOTAO_LOGIN}              id=login-button
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

# Criando as variáveis com os seletores que estão no código 

*** Keywords ***
Abrir o site da loja Sauce Demo

    #Abrir o browser
    Open Browser    ${SITE}   ${NAVEGADOR}  
    
    #Maximizando o browser
    Maximize Browser Window

Fazer login

    #Colocando o texto no campo de usuario
    Input Text              ${CAMPO_USUARIO}        ${USUARIO}

    #Colocando o texto no campo de senha
    Input Text              ${CAMPO_PASSWORD}       ${PASSWORD}

    #Clicando no botão de login
    Click Element           ${BOTAO_LOGIN}

    #Verificando sem tem a palavra Products, depois de fazer logins
    Page Should Contain     Products 

Adicionar um produto ao carrinho
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

