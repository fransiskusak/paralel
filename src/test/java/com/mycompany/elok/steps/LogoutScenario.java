package com.mycompany.elok.steps;

import com.mycompany.elok.steps.serenity.EndUserSteps;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by Fransiskus A K on 19/03/2019.
 */
public class LogoutScenario {
    @Steps
    EndUserSteps endUser;

    // ///////////////////////LOGOUT//////////////////////////////////////////

    @Given("Pengguna berada pada Halaman Dashboard e-LOK")
    public void penggunaBeradaPadaHalamanDashboard() {endUser.beradaDiDashboardpage();}

    @When("Pengguna mengeklik nama")
    public void penggunaKlikNama(){endUser.mengeklikNama();}

    @When("Pengguna mengeklik Logout")
    public void penggunaKlikLogout(){endUser.mengeklikLogout();}

    @Then("Pengguna akan melihat deskripsi '$isiTentangElok'")
    public void penggunaLihatTulisanDiHomepage(String isiTentangElok){endUser.akanLihatTulisan(isiTentangElok);}
}
