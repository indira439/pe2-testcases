package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.FileNotFoundException;

import static org.junit.Assert.*;

public class ReadFileTest {

    ReadFile readFile;

    @Before
    public void setUp() {
        readFile = new ReadFile();
    }

    @After
    public void tearDown() {
        readFile = null;
    }

    @Test
    public void givenFileNameShouldReadTheContentOfTheFileAndReturnTheContentOfFileInUppercase() {
        //act
        String actualResult = readFile.fileReader("sample",".txt");
        //assert
        assertEquals("THIS IS A SAMPLE FILE.",actualResult);
    }

    @Test
    public void givenFileShouldReturnTheLengthOfTheFile() {
        //act
        int actualResult = readFile.lengthOf("sample",".txt");
        //assert
        assertEquals(22,actualResult);
    }

    @Test
    public void givenFileShouldReturnTheLengthOfTheFileFailure() {
        //act
        int actualResult = readFile.lengthOf("sample",".txt");
        //assert
        assertNotEquals(12,actualResult);
    }

    @Test(expected = FileNotFoundException.class)
    public void givenInvalidFileShouldThrowException() {
        //act
        readFile.fileReader("SAMple",".txt");
//        readFile.fileReader(" ",".txt");
    }

    @Test
    public void givenFileNameShouldReadTheContentOfTheFileAndReturnTheContentOfFileInUppercaseFailure() {
        //act
        String actualResult = readFile.fileReader("sample",".txt");
        //assert
        assertNotEquals("THIS IS A SAMPLe FILE.",actualResult);
    }


}