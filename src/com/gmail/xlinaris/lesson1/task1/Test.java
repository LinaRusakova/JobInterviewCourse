package com.gmail.xlinaris.lesson1.task1;

public class Test {

    public static void main(String[] args) {

//        Test for first home task
        Person testPerson = new Person.BuilderPerson()
                .addFirstName("Макото")
                .addLastName("Синкай")
                .addAddress("Токио")
                .addAge(48)
                .addPhone("2-12-85-06")
                .addCountry("Япония")
                .addGender("М")
                .build();

        System.out.println(testPerson);
    }


}
