package Base;

import Data.RegistrationData;
import Pages.Registration;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegistrationTests extends BaseTests{
    RegistrationData data= new RegistrationData();

    @Test
    public void registerBusiness(){
        Registration registration= signIn.getRegistrationPage();
        String welcome= registration.registerBusiness(data.getBusinessName(), data.getFirstName(),
                data.getLastName(), data.getEmailAddress(), data.getPassword());
        assertEquals(welcome,"What would you like to start?");
    }
}
