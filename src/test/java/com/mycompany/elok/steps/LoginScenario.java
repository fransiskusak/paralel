package com.mycompany.elok.steps;

import com.mycompany.elok.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Fransiskus A K on 19/03/2019.
 */
public class LoginScenario {
    @Steps
    EndUserSteps endUser;


    @Given("Pengguna berada pada Homepage e-LOK")
    public void penggunaBeradaPadaHomepage() { endUser.beradaDiHomepage();}

    @When("Pengguna mengeklik textboxt Username")
    public void penggunaMengeklikBoxUsername() {
        endUser.mengeklikBoxUsername();
    }

    @When("Pengguna mengetik usernamenya '$username'")
    public void penggunaMengetikUsername(String username) {endUser.mengetikUsername(username);}

    @When("Pengguna mengeklik textboxt Password")
    public void penggunaMengeklikBoxPassword() {endUser.mengeklikBoxPassword();}

    @When("Pengguna mengetik passwordnya '$password'")
    public void penggunaMengetikPassword(String password) {endUser.mengetikPassword(password);}

    @When("Pengguna mengeklik tombol login")
    public void penggunaMengeklikLogin(){endUser.mengeklikLogin();}

    @Then("Pengguna akan melihat Nama User yaitu '$nama'")
    public void akanMelihatNamaPengguna(String nama) {endUser.akanLihatNamaPengguna(nama);}


}
