package org.umssdiplo.automationv01.core.managepage.Home;

import cucumber.api.java.en.And;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.managepage.Formulario.Formulario;
import org.umssdiplo.automationv01.core.utils.CommonEvents;

public class Home extends BasePage {

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[1]/div/div/button")
    private WebElement btnFormulario;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[1]/div/mat-grid-list/div/mat-grid-tile/figure/mat-card/mat-card-content/div[3]/button")
    private WebElement btnShow;

    @FindBy(xpath = "/html/body/app-root/app-detail/mat-grid-list/div/mat-grid-tile[2]/figure/div/mat-card/mat-card-actions/button")
    private WebElement btnModify;

    @FindBy(xpath = "/html/body/app-root/app-home/div/div[1]/div/mat-grid-list/div/mat-grid-tile[1]/figure/mat-card/mat-card-content/div[4]/button")
    private WebElement btnDelete;

    public Formulario pressButton() {
        CommonEvents.clickButton(btnFormulario);
        return new Formulario();
    }

    public void showMachine() {
        CommonEvents.clickButton(btnShow);
    }

    public void pressModify() {
        CommonEvents.clickButton(btnModify);
    }

    public void pressDelete() {
        CommonEvents.clickButton(btnDelete);
    }
}
