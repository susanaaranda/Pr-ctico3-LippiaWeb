package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.MyAccountRegistrationService;


public class MyAccountRegistrationStep extends PageSteps {
    @When("ingreso mail (.*)")
    public void ingresoMail(String mail) {

        MyAccountRegistrationService.ingresarMail(mail);
    }

    @And("ingreso un password (.*)")
    public void ingresoUnPassword(String password) {

        MyAccountRegistrationService.ingresarUnPassword(password);
    }

    @And("hago click en boton Register")
    public void hagoClickEnBotonRegister() {

        MyAccountRegistrationService.clickRegister();
    }

    @Then("se visualiza el mensaje (.*) de error")
    public void seVisualizaElMensajeDeError(String mensaje) {

        MyAccountRegistrationService.visualizaUnError(mensaje);
      }

}