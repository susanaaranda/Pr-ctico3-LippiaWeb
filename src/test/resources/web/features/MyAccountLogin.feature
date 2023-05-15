@TestLogin
Feature: MyAccountLogin

  Background:
    Given estoy en la pagina Automationtesting
    And hago click en botón "MyAccount" del menu

  @LoginExitoso
  Scenario Outline: loguearse con usuario valido exitosamente
    When ingreso username <username> valido
    And ingreso password <password> valido
    And hago click en boton "Login"
    Then se visualiza el dashboard de la aplicacion

    Examples:
    |username          |password      |
    |susyw6@hotmail.com|Bienvenido*456|

  @LoginFallido
  Scenario Outline: loguearse con usuario no valido
    When ingreso username <username> no valido
    And ingreso password <password> no valido
    And hago click en boton "Login"
    Then se visualiza mensaje <mensaje> de error

    Examples:
    |username          |password      |mensaje                                                                                              |
    |susyw6@hotmail.com|loljoinhun12..|Error: A user could not be found with this email address.                                            |
    |susiw6@hotmail.com|Bienvenido*456|Error: the password you entered for the username susyw6@hotmail.com is incorrect. Lost your password?|
    |                  |Bienvenido*456|Error: Username is required.                                                                         |
    |susyw6@hotmail.com|              |Error: Password is required.                                                                         |
    |                  |              |Error: Username is required.                                                                         |





