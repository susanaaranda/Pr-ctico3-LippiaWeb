package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;
import static lippia.web.constants.HomeConstant.*;


public class HomeService {

    public static void visualizarArribos() {
        Assert.assertTrue(WebActionManager.isVisible(SELENIUM_RUBI));
        Assert.assertTrue(WebActionManager.isVisible(THINKING_IN_HTML));
        Assert.assertTrue(WebActionManager.isVisible(MASTERING_JAVASCRIPT));
    }

    public static void clickImagenLibro() {

        WebActionManager.waitClickable(SELENIUM_RUBI).click();
    }

    public static void seVisualizaDescripcionLibro(String descripcion) {

        String DescripcionLibro = WebActionManager.getText(DESC_LIBRO);
        WebActionManager.waitClickable(DESC_LIBRO).click();
        Assert.assertTrue(WebActionManager.waitVisibility(DESC_LIBRO).isDisplayed());
        Assert.assertTrue(DescripcionLibro.contains(descripcion));

    }
}

