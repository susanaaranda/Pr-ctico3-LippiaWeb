package lippia.web.steps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;


public class HomeSteps {
    @Given("estoy en la pagina Automationtesting")
    public void estoyEnLaPaginaAutomationtesting() {

        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When("se visualizan tres arribos en New Arrivals")
    public void seVisualizanTresArribosEnNewArrivals() {

        HomeService.visualizarArribos();
    }

    @And("hago click sobre la imagen (.*) de un libro")
    public void hagoClickSobreLaImagenDeUnLibro(String libro) {
        HomeService.clickImagenLibro();
    }

    @Then("se visualiza la (.*) del libro")
    public void seVisualizaLaDescripcionDelLibro(String descripcion) {

        HomeService.seVisualizaDescripcionLibro(descripcion);
    }
}
