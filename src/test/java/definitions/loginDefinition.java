package definitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class loginDefinition {
    public static WebDriver driver;

    public loginDefinition() {

    }

    @Given("el usuario está en la página de login")
    public void elUsuarioEstaEnLaPaginaDeLogin() {

        hooks.driver.get("https://www.saucedemo.com/v1/index.html");
        System.out.println("Hola");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Espere 10 segundos");
    }
}
