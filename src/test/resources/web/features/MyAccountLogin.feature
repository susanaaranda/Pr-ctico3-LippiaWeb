@LoginLogout
Feature: MyAccountLogin

  Background:
    Given estoy en la pagina Automationtesting
    And hago click en botón My Account del menu

  @LoginExitoso
  Scenario Outline: loguearse con datos validos exitosamente
    When ingreso username <username> valido
    And ingreso password <password> valido
    And hago click en boton Login
    Then se visualiza un mensaje <mensaje>

    Examples:
    |username          |password      |mensaje |
    |susyw6@hotmail.com|Bienvenido*456|Hello   |

  @LoginFallido
  Scenario Outline: loguearse con datos no validos
    When ingreso un username <username> no valido
    And ingreso un password <password> no valido
    And hago click en boton Login
    Then se visualiza un <mensaje> de error

    Examples:
    |username          |password      |mensaje |
    |susyw8@hotmail.com|loljoinhun12..|Error   |
    |susiw6@hotmail.com|Bienvenido*456|Error   |
    |                  |Bienvenido*456|Error   |
    |susyw8@hotmail.com|              |Error   |
    |                  |              |Error   |

   @Logout
   Scenario: Desloguearse exitosamente
   When ingreso username <username> valido
    And ingreso password <password> valido
    And hago click en boton Login
    And se visualiza el dashboard con un mensaje <mensaje>
	When hago click en el boton Logout
	And se visualiza la pagina de Login
	And hago click en boton Retroceder una pagina
	Then se visualiza la pagina de Login
	
    Examples:
    |username          |password      |mensaje |
    |susyw6@hotmail.com|Bienvenido*456|Hello   |



