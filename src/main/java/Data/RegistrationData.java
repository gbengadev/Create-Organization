package Data;

import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Locale;

public class RegistrationData {
    private String businessName;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;

    public String getBusinessName() {
        return businessName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getPassword() {
        return password;
    }


    FakeValuesService faker = new FakeValuesService(
            new Locale("en-US"), new RandomService());

    public RegistrationData(){
        this.businessName= RandomStringUtils.randomAlphabetic(5,10);
        this.firstName= RandomStringUtils.randomAlphabetic(5,10);
        this.lastName= RandomStringUtils.randomAlphabetic(5,10);
        this.emailAddress= RandomStringUtils.randomAlphabetic(5,10)+ "@example.com";
        this.password= faker.regexify("[a-z1-9A-Z]{8}");

    }




}
