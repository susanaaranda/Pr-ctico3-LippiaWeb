@Shop
Feature: Shop

   Background:
     Given estoy en la pagina Automationtesting
     And hago click en "Menu Shop"

  @ReadMore
  Scenario Outline: Verificar la funcionalidad Read More exitosamente
    When hago click en boton 'Read More' de un <libro> sin stock
    And se visualiza la pagina del libro <libro>
    Then se visualiza informacion del libro con la leyenda <leyenda>

    Examples:
    |libro                       |leyenda      |
    |Android Quick Start Guide   |Out of Stock |
    |Functional Programming in JS|Out of Stock |


  @ClasificacionPorDefecto
  Scenario Outline: Visualizar libros por <default sorting> exitosamente
    When hago click en <default sorting> del menú Default Sorting
    Then se visualizan los libros buscados por <default sorting>

    Examples:
      |default sorting           |
      |Sort by popularity        |
      |Sort by average rating    |
      |Sort by newness           |
      |Sort by price: low to high|
      |Sort by price: high to low|



