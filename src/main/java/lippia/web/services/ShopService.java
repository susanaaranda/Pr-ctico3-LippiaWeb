package lippia.web.services;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import static lippia.web.constants.ShopConstant.*;
import org.testng.Assert;
import java.util.HashMap;
import java.util.Map;


public class ShopService {

    public static void clickMenuShop() {
        WebActionManager.click(BTN_MENUSHOP_ID);
    }

    public static void clickDefaulSorting(String elemento) {
        switch (elemento) {
            case "Sort by popularity":
                WebActionManager.waitClickable(ELEMENTO_POPULARITY).click();
                break;
            case "Sort by average rating":
                WebActionManager.waitClickable(ELEMENTO_AVERAGE).click();
                break;
            case "Sort by newness":
                WebActionManager.waitClickable(ELEMENTO_NEWNESS).click();
                break;
            case "Sort by price: low to high":
                WebActionManager.waitClickable(ELEMENTO_LOW).click();
                break;
            case "Sort by price: high to low":
                WebActionManager.waitClickable(ELEMENTO_HIGH).click();
                break;
        }
    }

    public static void clickEnDefault() {
        WebActionManager.waitClickable(ELEMENTO_DEFAULT);
    }

    public static void visualizarBusqueda(String elemento) {
        switch (elemento) {
            case "Sort by popularity":
                Assert.assertTrue(ActionManager.isSelected(ELEMENTO_POPULARITY));
                break;
            case "Sort by average rating":
                Assert.assertTrue(ActionManager.isSelected(ELEMENTO_AVERAGE));
                break;
            case "Sort by newness":
                Assert.assertTrue(ActionManager.isSelected(ELEMENTO_NEWNESS));
                break;
            case "Sort by price: low to high":
                Assert.assertTrue(ActionManager.isSelected(ELEMENTO_LOW));
                break;
            case "Sort by price: high to low":
                Assert.assertTrue(ActionManager.isSelected(ELEMENTO_HIGH));
                break;
            default:
                throw new RuntimeException("Clasificación sin definir");

        }

    }

    public static void clickSinStock(String libro) {
            Map <String, String> buttons = new HashMap<>();
            buttons.put("Android Quick Start Guide", READ_MORE_ANDROID);
            buttons.put("Functional Programming in JS", READ_MORE_JS);
            String xpathSinStock = buttons.get(libro);
            WebActionManager.waitClickable(xpathSinStock).click();
        }

    public static void visualizaPaginaLibro(String libro) {
        String xpathTitulo = TITULO_LIBRO.replace("%s",libro);
        Assert.assertTrue(ActionManager.isVisible(xpathTitulo));
    }

    public static void visualizaLeyenda(String leyenda) {
        Assert.assertTrue(ActionManager.waitPresence(LEYENDA_OUT).isDisplayed());
    }
}
