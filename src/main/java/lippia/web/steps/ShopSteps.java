package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

   // @Given("The client is in google page")
   // public void home() {

     //  SuperiorBarNavigationBarService.navegarWeb();
    //}

    @When( "The client tap on Shop menu" )
    public void theClientTapOnShop() {

       SuperiorBarNavigationBarService.tapMenu();
    }

    @Then( "The client see Filter By Price" )
    public void theClientSee(  ) {

        ShopService.verifyPage();
    }

    @Given("estoy en la pagina Automationtesting")
    public void estoyEnLaPaginaAutomationtesting() {

        SuperiorBarNavigationBarService.navegarWeb();
    }

    @And("hago click en {string}")
    public void hagoClickEn(String arg0) {
    }

    @When("hago click en Categoria <categoria> de la seccion {string}")
    public void hagoClickEnCategoriaCategoriaDeLaSeccion(String arg0) {
    }

    @Then("se visualizan libros de la categoria seleccionada")
    public void seVisualizanLibrosDeLaCategoriaSeleccionada() {
    }

    @When("hago click en boton {string} del primer libro")
    public void hagoClickEnBotonDelPrimerLibro(String arg0) {
    }

    @Then("se visualiza informacion del libro con la leyenda {string}")
    public void seVisualizaInformacionDelLibroConLaLeyenda(String arg0) {
    }
}
