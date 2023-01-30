package Test;

import BaseTest.BaseTest;
import Pages.*;
import Utils.ConstantUtils;
import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ResultTest extends BaseTest {
    public ResultDetailPage resultDetailPage;

@Test
    public void testresult() throws InterruptedException {
        SigninPage signinPage= homePage.clicksignin();
        signinPage.setusernamepassword("yipl_superadmin","SuperAdmin2030");
        OrganizationlistPage organizationlistPage=signinPage.clicklogin();
        organizationlistPage.setsearchkeys("bibhusan");
        organizationlistPage.clicksearchbutton();
       ActivityPage activityPage= organizationlistPage.clickmasquerade();
      // Thread.sleep(5000);
       activityPage.clickactivity();
       //Thread.sleep(5000);
       activityPage.fillform(faker.address().buildingNumber());
        activityPage.clickcreate();
       // Thread.sleep(5000);
        ResultPage resultPage=activityPage.clickresult();
       Thread.sleep(9000);
       resultPage.clickaddresult();
        Thread.sleep(4000);
       resultPage.fillresultform(faker.chuckNorris().fact(),faker.chuckNorris().fact());
       Thread.sleep(4000);
       resultPage.selecttype();
       resultPage.selectaggregation();
      Thread.sleep(4000);
        resultDetailPage=resultPage.clicksave();
       Thread.sleep(4000);
    }
    @Test(priority = 1)
    public void validateresulttitle(){
    resultDetailPage.getresulttitle();
        //assertEquals(descriptionPage.getdescriptiontitle(),ConstantUtils.descriptiontitle);
    }
    @Test(priority = 2)
    public void validateresulttype(){
        assertTrue(resultDetailPage.resulttypedisplayed(),"It is not displayed");
    }
    @Test(priority = 1)
    public void validateaggregation(){
    assertEquals(resultDetailPage.getresultaggregation(),ConstantUtils.resulttype);
    }

}
