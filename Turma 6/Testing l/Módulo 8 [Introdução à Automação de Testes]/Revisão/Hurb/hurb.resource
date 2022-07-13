*** Variables ***

${SITE}                                 https://hurb.com/br
${NAVEGADOR}                            Chrome
${BOTAO_COOKIES}                        xpath=//*[@id="CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"]
${BOTAO_PACOTES}                        xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[1]/div/div/button[2]
${CAMPO_PACOTES}                        xpath=//*[@id="destination-input"]
${TEXTO_PACOTES}                        Buenos Aires
${BOTAO_PESQUISAR}                      xpath=//*[@id="__next"]/div[1]/div[2]/div/div/div[2]/button
${CARD_VIAGEM}                          xpath=//*[@id="__next"]/div/main/section/div[2]/a[1]
${BOTAO_ESCOLHER_PACOTES}               xpath=//*[@id="__next"]/div/main/div[3]/aside/div/div/div[2]/button
${OPCAO_RJ}                             xpath=//*[@id="LGPKG-1095558-2723946"]
${BOTAO_PROXIMO}                        class=h-1yuatql
${BOTAO_TEMPO}                          class=h-7k3cv9
${BOTAO_PROXIMO_TEMPO}                  class=h-1yuatql
${BOTAO_IR_PAGAMENTO}                   class=h-1yuatql
${CONFIGURACAO_VIAJEM1}                 4 diárias
${CONFIGURACAO_VIAJEM2}                 1 pessoa por pacote
${PERIODO_VIAJEM1}                      15 Set 2022
${PERIODO_VIAJEM2}                      30 Nov 2022                 
${BOLETO_PARCELADO}                     xpath=//*[@id="ui-id-1"]
${CAMPO_NOME}                           xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[1]/div/input
${NOME}                                 Teste Beta
${CAMPO_CPF}                            xpath=//*[@id="paymentMethods__bill"]/section/div[1]/div[2]/div/input
${CPF}                                  705.127.670-09
${CAMPO_CEL}                            xpath=//*[@id="paymentMethods__bill"]/section/div[2]/div[1]/div/input
${CEL}                                  (11) 99000-0000
${CHECKBOX}                             xpath=//*[@id="cancellation-policy"]
${CANCELAMENTO_GRATIS}                  Cancelamento Grátis!




*** Keywords ***
Abrir o site do Hurb
  Open Browser         ${SITE}             ${NAVEGADOR}
  Maximize Browser Window
  Sleep                                    3

Clicar em “Permitir todos os cookies”
   
  Wait and Click      ${BOTAO_COOKIES}

Selecionar a opção “Pacotes”
  #  Sleep                                    3
  Wait and Click      ${BOTAO_PACOTES} 

Buscar por alguma cidade turística (Ex: Buenos Aires, Florença, Orlando) e clicar em “Pesquisar”
 #   Sleep                                    3
  Wait and Input Text         ${CAMPO_PACOTES}           ${TEXTO_PACOTES}
  Wait and Click              ${BOTAO_PESQUISAR}

Selecionar um pacote de viagem
  Sleep                       3
  Wait and Click              ${CARD_VIAGEM}
  Switch Window               NEW

Clicar em “Escolher pacote”
 #   Sleep                                    3
  Wait and Click              ${BOTAO_ESCOLHER_PACOTES}

Selecionar as opções do pacote e clicar em “Ir para pagamento”
 #   Sleep                                    3

  Wait and Click              ${OPCAO_RJ}
  Wait and Click              ${BOTAO_PROXIMO}
  Wait and Click              ${BOTAO_TEMPO}
  Wait and Click              ${BOTAO_PROXIMO_TEMPO}
  Wait and Click              ${BOTAO_IR_PAGAMENTO}

Validar as informações da “Configuração” da viagem
  Sleep                       3
  Page Should Contain         ${CONFIGURACAO_VIAJEM1}
  Page Should Contain         ${CONFIGURACAO_VIAJEM2}

Validar as informações do período da viagem
  Page Should Contain         ${PERIODO_VIAJEM1}
  Page Should Contain         ${PERIODO_VIAJEM2}

Selecionar a opção “Boleto parcelado” (se não estiver disponível, escolha qualquer outro)
  Wait and Click              ${BOLETO_PARCELADO}  

Preencher os dados de pagamento
  Wait and Input Text         ${CAMPO_NOME}                 ${NOME}
  Wait and Input Text         ${CAMPO_CPF}                  ${CPF}
  Wait and Input Text         ${CAMPO_CEL}                  ${CEL}


Marcar o checkbox “Li e aceito as condições de termos de uso e política de privacidade”
  Wait and Click              ${CHECKBOX}

Validar a informação sobre cancelamento grátis
  Page Should Contain         ${CANCELAMENTO_GRATIS}







Wait and Click
  [Arguments]                       ${ELEMENTO}
#   Wait Until Element is Visible     ${ELEMENTO}
  Click Element                     ${ELEMENTO}


Wait and Input Text
  [Arguments]                     ${CAMPO}    ${TEXTO}
  Wait Until Element is Visible   ${CAMPO}
  Input Text                      ${CAMPO}    ${TEXTO}