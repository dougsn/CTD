*** Settings ***
Library             SeleniumLibrary
Resource            ./douglas.resource
# Test Teardown       Close Browser

*** Test Cases ***
Processo de compra na loja Sauce Demo
  Acessar o site
  Fazer login
  Adicionar um produto ao carrinho
  Acessar o carrinho
  Clicar em 'Checkout'
  Preencher informações do usuário
  Clicar em 'Finish'


Processo de compra na loja Sauce Demo com usuário incorreto
  Acessar o site
  Fazer login com usuário incorretos



# robot -d ./logs seuarquivo.robot -> Para criar uma pasta de logs.

# Wait Until Element is Visible   ${ELEMENTO} ->  Espera o elemento aparecer para clicar

# robot -t "Nome do Caso de Teste" seuarquivo.robot ->  Rodar apenas 1 caso de teste


# Element Should Contain ${Código do Elemeto}