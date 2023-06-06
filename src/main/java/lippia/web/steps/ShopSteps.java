package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;


public class ShopSteps extends PageSteps {

    @And("^hago click en \"(.*)\"$")
    public void hagoClickEnMenuShop(String arg) {
        ShopService.clickMenuShop();
    }

    @Then("se visualiza informacion del libro con la leyenda (.*)")
    public void seVisualizaInformacionDelLibroConLaLeyenda(String leyenda) {

        ShopService.visualizaLeyenda(leyenda);
    }

    @Then("se visualizan los libros buscados")
    public void seVisualizanLosLibrosBuscados() {
    }

    @When("hago click en (.*) del menú Default Sorting")
    public void hagoClickEnDefaultSortingDelMenú(String sorting) {
        ShopService.clickEnDefault();
        ShopService.clickDefaulSorting(sorting);
    }

    @Then("se visualizan los libros buscados por (.*)")
    public void seVisualizanLosLibrosBuscadosPorDefaultSorting(String elemento) {
        ShopService.visualizarBusqueda(elemento);
    }

    @When("hago click en boton 'Read More' de un (.*) sin stock")
    public void hagoClickEnBotonDeUnLibroSinStock(String libro) {

        ShopService.clickSinStock(libro);
    }

    @And("se visualiza la pagina del libro (.*)")
    public void seVisualizaLaPaginaDelLibroLibro(String libro) {

        ShopService.visualizaPaginaLibro(libro);
    }
}
