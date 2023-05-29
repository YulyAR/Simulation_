package co.edu.udea.certificacion.calidad.stepdefinition;

import co.edu.udea.certificacion.calidad.questions.Validation;
import co.edu.udea.certificacion.calidad.tasks.OpenThe;
import co.edu.udea.certificacion.calidad.tasks.RandomValues;
import co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.edu.udea.certificacion.calidad.userinterfaces.UsuarioPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class SimulationBancolombiaStepDefinition {

    @Managed(driver= "chrome")
    public WebDriver driver;

    private Actor usuario = Actor.named("Usuario");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }
    @Given("^que he presionado el boton simular en la pagina de creditos de consumo de bancolombia$")
    public void queHePresionadoElBotonSimularEnLaPaginaDeCreditosDeConsumoDeBancolombia() {

        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()),Click.on(SIMULAR));
    }


    @When("^presiono el boton continuar en la pagina del simulador$")
    public void presionoElBotonContinuarEnLaPaginaDelSimulador() {
        usuario.attemptsTo(Click.on(CONTINUAR));
    }

    @When("^puedo responder la pregunta,sabes cuanto dinero necesitas, seleccionando la opcion si$")
    public void puedoResponderLaPreguntaSabesCuantoDineroNecesitasSeleccionandoLaOpcionSi() {
        usuario.attemptsTo(Click.on(RADIOBUTTON_SI));
    }

    @And("^puedo ingresar un monto entre 1.000.000 y 500.000.000")
    public void puedoIngresarUnMontoEntreY() {
        usuario.attemptsTo(Enter.theValue(RandomValues.getAmountMoney()).into(MONTO));
    }

    @And("^puedo ingresar un plazo entre 48 y 84 meses")
    public void puedoIngresarUnPlazoEntreYMeses() {
        usuario.attemptsTo(Enter.theValue(RandomValues.getMonths()).into(PLAZO));
    }

    @And("^puedo seleccionar una fecha de nacimiento$")
    public void puedoSeleccionarUnaFechaDeNacimiento() {
        usuario.attemptsTo(Click.on(FECHA));
        usuario.attemptsTo(Click.on(ANIO));
        usuario.attemptsTo(Click.on(MES));
        usuario.attemptsTo(Click.on(DIA));
    }

    @And("^puedo seleccionar el boton simular$")
    public void puedoSeleccionarElBotonSimular() {
        usuario.attemptsTo(Click.on(SIMULAR1));
    }

    @Then("^puedo ver las opciones para credito de libre inversion$")
    public void puedoVerLasOpcionesParaCreditoDeLibreInversion() {
        usuario.should(seeThat(Validation.simulation(), equalTo(true)));
    }
}
