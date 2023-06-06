@Login
Feature: MyAccountLogin

  Background:
    Given estoy en la pagina Automationtesting
    And hago click en botón My Account del menu

  @LoginExitoso
  Scenario Outline: loguearse con datos validos exitosamente
    When ingreso username <username> valido
    And ingreso passwords <passwords> valido
    And hago click en boton Login
    Then se visualiza mensaje <mensaje>

    Examples:
      | username           | passwords      | mensaje |
      | susyw6@hotmail.com | Bienvenido*456 | Hello   |

  @LoginFallido
  Scenario Outline: loguearse con datos no validos
    When ingreso un username <username> no valido
    And ingreso password <password> no valido
    And hago click en boton Login
    Then se visualiza un <mensaje> de error

    Examples:
      | username           | password       | mensaje |
      | susyw8@hotmail.com | loljoinhun12.. | Error   |
      | susiw6@hotmail.com | Bienvenido*456 | Error   |
      |                    | Bienvenido*456 | Error   |
      | susyw8@hotmail.com |                | Error   |
      |                    |                | Error   |

  @SignOut
  Scenario Outline: Desloguearse exitosamente
    When ingreso username <username> valido
    And ingreso passwords <passwords> valido
    And hago click en boton Login
    And se visualiza mensaje <mensaje>
    When hago click en el boton Sign Out
    And se visualiza el Login
    And hago click en boton Retroceder de la pagina
    Then se visualiza el Login

    Examples:
      | username           | passwords      | mensaje |
      | susyw6@hotmail.com | Bienvenido*456 | Hello   |



