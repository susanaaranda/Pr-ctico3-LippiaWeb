package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.MyAccountLoginService;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

import static com.crowdar.core.actions.WebActionManager.click;
import static lippia.web.constants.SuperiorNavigationBarConstants.BTN_READMORE_ID;

public class ShopSteps extends PageSteps {

    @And("^hago click en \"(.*)\"$")
    public void hagoClickEnBotonMenuShop(String menuShopButton) {

        ShopService.clickMenuShop();
    }

    @When("hago click en Categoria (.*) de la seccion Product Categories")
    public void hagoClickEnCategoriaCategoriaDeLaSeccion(String categoria) {
    }

    @Then("se visualizan libros de la categoria seleccionada")
    public void seVisualizanLibrosDeLaCategoriaSeleccionada() {
    }

    @When("^hago click en boton \"(.*)\" del primer libro$")
   public void hagoClickEnBotonDelPrimerLibro(String primerLibroButton) {

        //ShopService.clickReadMore();
    }

    @Then("se visualiza informacion del libro con la leyenda {string}")
    public void seVisualizaInformacionDelLibroConLaLeyenda(String arg0) {
    }

}
