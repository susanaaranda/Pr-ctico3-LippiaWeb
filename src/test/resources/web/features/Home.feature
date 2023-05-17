Feature: Home Page

  Background:
    Given ingreso a la app Automationtesting
    And hago click en "Menu Shop"
    And hago click en "Menu Home"

  @home
  Scenario: Visualizar Home Page con solo tres llegadas
    When se visualiza la seccion "New Arrivals"
    Then se verifica que solo posee tres llegadas

  @home
  Scenario: Visualizar que las imagenes en Arrivals navegan exitosamente
    When hago click sobre la primer imagen en "New Arrivals"
    Then se visualiza la pagina del libro con el boton "Add to basket"

  @home
  Scenario: Visualizar la Descripcion de un libro exitosamente
    When hago click sobre la primer imagen en "New Arrivals"
    Then se visualiza la descripcion del libro en la pestaña "Description"