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

    @Test(expected = IllegalArgumentException.class)
    public void givenNegativeIntegerShouldThrowIllegalArgumentException() {
        //act
        String age = memberVariable.memberAge(-20);
        String salary = memberVariable.memberAge(-20000.598);
    }
}