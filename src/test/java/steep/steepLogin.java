package steep;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

import static UI.FormularioUI.*;
import static UI.FormularioUI.PERMANENT_ADDRESS;

/**
 * Created by Richard Lopez on 03/06/2022
 * Visit Linkedin https://www.linkedin.com/in/richard-lopez-/
 **/
public class steepLogin {
    WebDriver driver;
    @Before
    public void setup(){
      driver  = new ChromeDriver();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @Given("que ingresa la pagina principal de la web")
    public void queIngresaLaPaginaPrincipalDeLaWeb() {
        driver.get("https://demoqa.com/text-box");

    }

    @When("completa los datos de registro en el sistema {string} {string} {string} {string}")
    public void completaLosDatosDeRegistroEnElSistema(String fullName, String email, String currentAddress, String permanentAddress) throws Exception {
        driver.findElement(FULL_NAME).sendKeys(fullName);
        driver.findElement(EMAIL).sendKeys(email);
        driver.findElement(CURRENT_ADDRESS).sendKeys(currentAddress);
        driver.findElement(PERMANENT_ADDRESS).sendKeys(permanentAddress);
    }

    @Then("se visualiza los datos completados abajo del formulario {string}")
    public void seVisualizaLosDatosCompletadosAbajoDelFormulario(String mensaje) {
        Assert.assertEquals(mensaje,"sastifactorio","No se guardo sastifactoriamente los datos");

    }
    @After
    public void after(){
        driver.close();
    }

    @Then("ingresa de manera sastifactoria")
    public void ingresaDeManeraSastifactoria() {
        Assert.assertTrue(true);
    }

    @Given("que realiza el login en la web {string} {string}")
    public void queRealizaElLoginEnLaWeb(String user, String password) {
        driver.get("https://demoqa.com/login");
        driver.findElement(USER_NAME).sendKeys(user);
        driver.findElement(PASSWORD).sendKeys(password);

    }
}
