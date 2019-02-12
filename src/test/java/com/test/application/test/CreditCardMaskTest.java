package com.test.application.test;

import com.test.application.CreditCardMaskApplication;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;

@RunWith(JUnit4.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CreditCardMaskTest {
    private CreditCardMaskApplication application = new CreditCardMaskApplication();
    private String number = "";
    private String mask = "";
    private String result = "";
    private String expected = "";

    @Test
    public void maskByDisplayLastFourDigitsWithoutSeparation() {
        number = "5327463548960777";
        mask = "xxxxxxxxxxxx####";
        expected = "xxxxxxxxxxxx0777";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }

    @Test
    public void maskByDisplayingAllNumberWithSeparation() {
        number = "5275330192145447";
        mask = "####-####-####-####";
        expected = "5275-3301-9214-5447";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }

    @Test
    public void maskByDisplayingLastFourDigitsWithSeparation() {
        number = "5327463548960777";
        mask = "xxxx-xxxx-xxxx-####";
        expected = "xxxx-xxxx-xxxx-0777";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }

    @Test
    public void maskByDisplayingSecondMiddleFourDigitsWithSeparation() {
        number = "5327463548960777";
        mask = "xxxx-####-xxxx-xxxx";
        expected = "xxxx-4635-xxxx-xxxx";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }

    @Test
    public void maskByDisplayingLastFourDigitsOnly() {
        number = "5327463548960777";
        mask = "####";
        expected = "5327";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }

    @Test
    public void unableToMaskingCreditCardIfMaskValueIsEmpty() {
        number = "5327463548960777";
        mask = "";
        expected = "Invalid Request : Mask is Empty";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }

    //This test is intended to fail
    @Test
    public void unableToMaskingCreditCardIfNumberIsEmpty() {
        number = "";
        mask = "####-xxxx-xxxx-####";
        expected = "Number is Empty";
        result = application.maskCreditCardNumber(number, mask);
        Assert.assertEquals(expected, result);
        System.out.println("Credit Card Number before musking: "+number);
        System.out.println("Credit Card Number after musking: "+result);
    }
}
