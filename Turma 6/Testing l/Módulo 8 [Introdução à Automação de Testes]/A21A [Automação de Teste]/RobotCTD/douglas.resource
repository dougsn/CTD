*** Variable ***
${SITE}             https://www.saucedemo.com 
${NAVEGADOR}        Chrome
${CAMPO_USUARIO}    id=user-name
${USUARIO}          standard_user
${CAMPO_PASSWORD}   id=password
${PASSWORD}         secret_sauce
${BOTAO_LOGIN}      id=login-button

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
    