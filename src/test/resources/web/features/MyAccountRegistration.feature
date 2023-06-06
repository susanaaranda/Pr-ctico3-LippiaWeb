@Registration
Feature: MyAccountRegistration

  Background:
    Given estoy en la pagina Automationtesting
    And hago click en botón My Account del menu

  @RegistrationFallida
  Scenario Outline: Registracion fallida
    When ingreso mail <mail>
    And ingreso un password <password>
    And hago click en boton Register
    Then se visualiza el mensaje <mensaje> de error

    Examples:
      |mail                       |password      |mensaje |
      |susana.gonzalez24@gmail.com|              |Error   |
      |                           |              |Error   |
