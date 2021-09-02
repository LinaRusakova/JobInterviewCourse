package com.gmail.xlinaris.lesson1.task1;

public class Person {
    private String firstName;
    private String lastName;
    private String middleName;
    private String country;
    private String address;
    private String phone;
    private int age;
    private String gender;


    public static class BuilderPerson {
        private Person newPerson;

        public BuilderPerson() {
            newPerson = new Person();
        }

        public BuilderPerson addFirstName(String firstName) {
            newPerson.firstName = firstName;
            return this;
        }

        public BuilderPerson addLastName(String lastName) {
            newPerson.lastName = lastName;
            return this;
        }

        public BuilderPerson addMiddleName(String middleName) {
            newPerson.middleName = middleName;
            return this;
        }

        public BuilderPerson addCountry(String country) {
            newPerson.country = country;
            return this;
        }

        public BuilderPerson addAddress(String address) {
            newPerson.address = address;
            return this;
        }

        public BuilderPerson addPhone(String phone) {
            newPerson.phone = phone;
            return this;
        }

        public BuilderPerson addAge(int age) {
            newPerson.age = age;
            return this;
        }

        public BuilderPerson addGender(String gender) {
            newPerson.gender = gender;
            return this;
        }

        public Person build() {
            return newPerson;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", country='" + country + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
