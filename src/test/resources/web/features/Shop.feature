@TestShop
Feature: Shop

   Background:
     Given estoy en la pagina Automationtesting
     And hago click en "Menu Shop"

  Scenario: Verificar la funcionalidad Read More exitosamente
    When hago click en boton "Read More" del primer libro
    Then se visualiza informacion del libro con la leyenda "Out of Stock"


  Scenario Outline: Visualizar libros por Categoria <categoria> exitosamente
    When hago click en Categoria <categoria> de la seccion Product Categories
    Then se visualizan libros de la categoria seleccionada

    Examples:
      | categoria  |
      | Android    |
      | HTML       |
      | JavaScript |
      | Selenium   |
