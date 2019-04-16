package org.umssdiplo.automationv01.core.managepage.Formulario;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.umssdiplo.automationv01.core.managepage.BasePage;
import org.umssdiplo.automationv01.core.utils.CommonEvents;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class Formulario extends BasePage {

    @FindBy(xpath = "//*[@id=\"mat-input-0\"]")
    private WebElement codField;

    @FindBy(xpath = "//*[@id=\"mat-input-1\"]")
    private WebElement catField;

    @FindBy(xpath = "//*[@id=\"mat-input-2\"]")
    private WebElement marcaField;

    @FindBy(xpath = "//*[@id=\"mat-input-3\"]")
    private WebElement modelField;

    @FindBy(xpath = "//*[@id=\"mat-input-4\"]")
    private WebElement capacidadField;

    @FindBy(xpath = "//*[@id=\"mat-input-5\"]")
    private WebElement precioField;

    @FindBy(xpath = "//*[@id=\"mat-input-6\"]")
    private WebElement urlVideoField;

    @FindBy(xpath = "//*[@id=\"form\"]/button")
    private WebElement buttonSubmit;

    public Formulario() {

    }

    public void insertCod(String cod) {
        CommonEvents.setInputField(codField, cod);
    }

    public void insertCat(String cat) {
        CommonEvents.setInputField(catField, cat);
    }

    public void insertMarca(String marca) {
        CommonEvents.setInputField(marcaField, marca);
    }

    public void insertModel(String model) {
        CommonEvents.setInputField(modelField, model);
    }

    public void insertCapacidad(String capacidad) {
        CommonEvents.setInputField(capacidadField, capacidad);
    }

    public void insertPrecio(String precio) {
        CommonEvents.setInputField(precioField, precio);
    }

    public void insertUrlVideo(String urlVideo) {
        CommonEvents.setInputField(urlVideoField, urlVideo);
    }


    public void saveNewForm() {
        CommonEvents.clickButton(buttonSubmit);
        LoadPage.navegateFormulario();
    }
}
