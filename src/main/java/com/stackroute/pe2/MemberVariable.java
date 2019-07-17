package com.stackroute.pe2;

import java.security.InvalidParameterException;

public class MemberVariable {
    /*
    Object creation of Member class.
     */
    Member member = new Member();

    public String memberName(String name){
        /*
        If the length of the passed String is 0 then it will
        return "Enter valid string".
        Else, this method sets the value to the name property in
        member class by using setters
        And gets the Member name property by using getters.
         */
        if (name.split(" ").length == 0){
            return "Enter valid string";
        }
        member.setName(name);
        return member.getName();
    }

    public int memberAge(int age){
        /*
        If the age lesser than 0 then it will throw Invalid Parameter Exception.
        Else, this method sets the value to the age property in
        member class by using setters
        And gets the Member age property by using getters.
         */
        if (age < 0){
            throw new InvalidParameterException();
        }
        member.setAge(age);
        return member.getAge();
    }

    public String memberAge(String age){
        /*
        If a null value is passed to memberAge() method then
        this method will throw Null Pointer Exception.
         */
        throw new NullPointerException();
    }

    public double memberSalary(double salary){
        /*
        If the salary is lesser than 0 then it will throw Invalid Parameter Exception.
        Else, this method sets the value to the salary property in
        member class by using setters
        And gets the Member salary property by using getters.
         */
        if (salary < 0){
            throw new InvalidParameterException();
        }
        member.setSalary(salary);
        double membersalary = member.getSalary();
        return membersalary;
    }

    public String memberSalary(String salary){
        /*
        If null is passed to memberSalary() method then this method will
        throw Null Pointer Exception.
         */
        throw new NullPointerException();
    }



}
