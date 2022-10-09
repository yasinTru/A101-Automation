package StepDefinitions;

import Framework.DriverSetup;
import Pages.DeliveryPage;
import Pages.MailCheckoutPage;
import Pages.PaymentPage;
import io.cucumber.java.en.Then;

public class PaymentPageSteps {

    DeliveryPage deliveryPage= new DeliveryPage(DriverSetup.getDriver());
    PaymentPage paymentPage= new PaymentPage(DriverSetup.getDriver());
    MailCheckoutPage mailCheckout= new MailCheckoutPage(DriverSetup.getDriver());

    @Then("I should see payment page visible")
    public void PaymentPageProcess() throws InterruptedException
    {
        mailCheckout.setEmailInput();
        mailCheckout.setContinueBtn();
        deliveryPage.setCreateAddressBtn();
        deliveryPage.setAddressTitle();
        deliveryPage.setNameInput();
        deliveryPage.setSurnameInput();
        deliveryPage.setPhoneInput();
        deliveryPage.setCityDropdown();
        deliveryPage.setTownshipDropdown();
        deliveryPage.setDistrictDropdown();
        deliveryPage.setAddressField();
        deliveryPage.setSubmitBtn();
        deliveryPage.setCargoCompany();
        deliveryPage.setSubmitAndContinue();
        paymentPage.setNameSurnameInput();
        paymentPage.setCardNumberInput();
        paymentPage.setExpirationMonth();
        paymentPage.setExpirationYear();
        paymentPage.setCvcInput();
        paymentPage.setAgrement();
       // paymentPage.setCompleteOrderBtn();
    }

}
