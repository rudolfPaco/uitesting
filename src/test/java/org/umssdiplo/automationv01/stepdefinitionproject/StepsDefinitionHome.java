package org.umssdiplo.automationv01.stepdefinitionproject;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.umssdiplo.automationv01.core.managepage.Formulario.Formulario;
import org.umssdiplo.automationv01.core.managepage.Home.Home;
import org.umssdiplo.automationv01.core.utils.LoadPage;

public class StepsDefinitionHome {
    private Home home;
    private Formulario formulario;

    @Given("^'Home' page is loaded$")
    public void HomePageIsLoaded() throws Throwable {
        home = LoadPage.homePage();
    }

    @Then("^press new 'Formulario' button$")
    public void FormularioPageIsLoaded() throws Throwable {
        formulario = home.pressButton();
    }
    @And("^insert \"([^\"]*)\" codigo name field in 'Formulario' page$")
    public void insertCodForm(String cod){
        formulario.insertCod(cod);
    }
    @And("^insert \"([^\"]*)\" categoria name field in 'Formulario' page$")
    public void insertCatForm(String cat){
        formulario.insertCat(cat);
    }
    @And("^insert \"([^\"]*)\" marca name field in 'Formulario' page$")
    public void insertMarcaForm(String marca){
        formulario.insertMarca(marca);
    }

    @And("^insert \"([^\"]*)\" modelo name field in 'Formulario' page$")
    public void insertModelForm(String model){
        formulario.insertModel(model);
    }
    @And("^insert \"([^\"]*)\" capacidad name field in 'Formulario' page$")
    public void insertCapacidadForm(String capacidad){
        formulario.insertCapacidad(capacidad);
    }
    @And("^insert \"([^\"]*)\" precio name field in 'Formulario' page$")
    public void insertPrecioForm(String precio){
        formulario.insertPrecio(precio);
    }
    @And("^insert \"([^\"]*)\" urlVideo name field in 'Formulario' page$")
    public void insertUrlVideoForm(String urlVideo){
        formulario.insertUrlVideo(urlVideo);
    }
    @And("^press submit button$")
    public void pressButtonSubmit(){
        formulario.saveNewForm();
    }

    @And("^press show 'Formulario' button$")
    public void pressShowButton(){
        home.showMachine();
    }

    @And("^press modify machine button$")
    public void pressModifyButton(){
        home.pressModify();
    }

    @And("^press delete machine button$")
    public void pressDeleteButton(){
        home.pressDelete();
    }
}
