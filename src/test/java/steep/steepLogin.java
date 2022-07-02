package steep;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

/**
 * Created by Richard Lopez on 03/06/2022
 * Visit Linkedin https://www.linkedin.com/in/richard-lopez-/
 **/
public class steepLogin {
    @Given("que ingresas a la web")
    public void queIngresasALaWeb() {
        Assert.assertTrue(true);
    }

    @When("el usuario ingresas sus credenciales validas")
    public void elUsuarioIngresasSusCredencialesValidas() {
        Assert.assertTrue(true);
    }

    @Then("ingresas sastifactoriamente al home")
    public void ingresasSastifactoriamenteAlHome() {
        Assert.assertTrue(true);
    }
}
