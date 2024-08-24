package definitions;

import io.cucumber.java.en.Given;


public class loginDefinition {
    public loginDefinition(){

    }
    @Given("el usuario está en la página de login")
    public void elUsuarioEstaEnLaPaginaDeLogin() {

        hooks.driver.get("https://www.saucedemo.com/v1/index.html");
        System.out.println("Hola");
    }
}
