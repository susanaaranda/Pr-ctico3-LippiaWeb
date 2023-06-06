@Home
Feature: Home

  Background:
    Given estoy en la pagina Automationtesting

  @DescripcionLibro
  Scenario Outline: Visualizar la Descripcion de un libro exitosamente
    When se visualizan tres arribos en New Arrivals
    And hago click sobre la imagen <imagen> de un libro
    Then se visualiza la <informacion> del libro

  Examples:
  |imagen        |informacion        |
  |THINKING_HTML |Product Description|




#  @home
#  Scenario: Visualizar las Reviews de un libro exitosamente
#    When hago click sobre la primer imagen en "New Arrivals"
#    And hago click en pestaña "Reviews" del libro
#    Then se visualiza las reseñas del libro seleccionado