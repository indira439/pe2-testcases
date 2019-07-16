package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.security.InvalidParameterException;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable;

    @Before
    public void setUp() {
        this.memberVariable = new MemberVariable();
    }

    @After
    public void tearDown() {
        memberVariable= null;
    }

    @Test
    public void givenStringShouldDisplayMemberName() {
        //act
        String actualResult = memberVariable.memberName("indu");
        //assert
        assertEquals("indu",actualResult);
    }

    @Test
    public void givenIntegerShouldDisplayMembersAge() {
        //act
        int actualResult = memberVariable.memberAge(15);
        //assert
        assertEquals(15,actualResult);
    }

    @Test
    public void givenFloatShouldDisplayMembersSalary() {
        //act
        double actualResult = memberVariable.memberSalary(45000.45);
        //assert
        assertEquals(45000.45, actualResult, 0.00);
    }
    @Test
    public void givenStringShouldDisplayMemberNameFailure() {
        //act
        String actualResult = memberVariable.memberName("indu");
        //assert
        assertNotEquals("in",actualResult);
    }

    @Test
    public void givenIntegerShouldDisplayMembersAgeFailure() {
        //act
        int actualResult = memberVariable.memberAge(15);
        //assert
        assertNotEquals(67,actualResult);
    }

    @Test
    public void givenFloatShouldDisplayMembersSalaryFailure() {
        //act
        double actualResult = memberVariable.memberSalary(45000.45);
        //assert
        assertNotEquals(2547,actualResult);
    }

    @Test
    public void givenEmptyStringShouldThrowErrorMessage() {
        //act
        String actualResult = memberVariable.memberName(" ");
        //assert
        assertEquals("Enter valid string",actualResult);
    }

    @Test(expected = NullPointerException.class)
    public void givenNullShouldThrowNullPointerException() {
        //act
        String name = memberVariable.memberName(null);
        String age = memberVariable.memberAge(null);
        String salary = memberVariable.memberSalary(null);
    }

    @Test(expected = InvalidParameterException.class)
    public void givenNegativeIntegerShouldInvalidParameterException() {
        //act
        memberVariable.memberSalary(-2000.76);
        memberVariable.memberAge(-20);
    }
}