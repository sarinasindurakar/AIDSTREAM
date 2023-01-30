package Test;


import BaseTest.BaseTest;
import Pages.OrganizationlistPage;
import Pages.SigninPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void sucessfulLogin(){
      SigninPage signinPage= homePage.clicksignin();
      signinPage.setusernamepassword("yipl_superadmin","SuperAdmin2030");
      OrganizationlistPage organizationlistPage=signinPage.clicklogin();
      organizationlistPage.setsearchkeys("bibhusan");



    }
}
