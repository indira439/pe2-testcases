package com.stackroute.pe2;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MemberVariableTest {

    MemberVariable memberVariable;

    @BeforeClass
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
        int actualResult = memberVariable.memberSalary(45000.45);
        //assert
        assertEquals(45000.45,actualResult);
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
        int actualResult = memberVariable.memberSalary(45000.45);
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

    @Test
    public void givenNegativeIntegerShouldThrowErrorMessage() {
        //act
        String actualResult = memberVariable.memberAge(-20);
        //assert
        assertEquals("Age will not be in negative",actualResult);
    }

    @Test
    public void givenNegativeIntegerShouldThrowErrorMessage() {
        //act
        String actualResult = memberVariable.memberSalary(-2000.76);
        //assert
        assertEquals("Salary will not be in negative",actualResult);
    }
}