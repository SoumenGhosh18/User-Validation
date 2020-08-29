package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void  givenFirstName_WhenProper_ShouldReturnTrue() {
       UserValidation uv=new UserValidation();
        boolean result = uv.validateFirstName("Soumen");
        Assert.assertTrue(result);
    }
    @Test
    public void givenFirstName_WhenNotCapital_ShouldReturnFalse() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateFirstName("soumen");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenLastNameStartsWithCapitalLetter_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateLastName("Ghosh");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenLastName_MinimumThreeLetter_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateLastName("Ghos");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenNotStartWithSmallLetter_Return_False() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateEmail("Soumen@gmail.com");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenEndsWithComOrIn_Return_True() {
        UserValidation uv = new UserValidation();
        boolean result = uv.validateEmail("soumen@gmail.com");
        Assert.assertEquals(true, result);
    }

}
