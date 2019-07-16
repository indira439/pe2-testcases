package com.stackroute.pe2;

import java.security.InvalidParameterException;

public class MemberVariable {
    Member member = new Member();

    public String memberName(String name){
        if (name.split(" ").length == 0){
            return "Enter valid string";
        }
        member.setName(name);
        return member.getName();
    }

    public int memberAge(int age){
        if (age < 0){
            throw new InvalidParameterException();
        }
        member.setAge(age);
        return member.getAge();
    }

    public String memberAge(String age){
        throw new NullPointerException();
    }

    public double memberSalary(double salary){
        if (salary < 0){
            throw new InvalidParameterException();
        }
        member.setSalary(salary);
        double membersalary = member.getSalary();
        return membersalary;
    }

    public String memberSalary(String salary){
        throw new NullPointerException();
    }



}
