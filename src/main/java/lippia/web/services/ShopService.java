package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.SuperiorNavigationBarConstants;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.click;
import static lippia.web.constants.SuperiorNavigationBarConstants.BTN_READMORE_ID;

public class ShopService {


   //private static final String FILTER_BY_PRICE_LABEL = "xpath://*[@id='woocommerce_price_filter-2']/h4";
    private static final String BTN_MENUSHOP_ID = "id:menu-item-40";


    public static void clickReadMore()    {  click(BTN_READMORE_ID);
    }
     public static void clickMenuShop()    {  click(BTN_MENUSHOP_ID);
    }

}