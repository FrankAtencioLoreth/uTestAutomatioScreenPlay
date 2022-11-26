package com.utest.model;

public class Data {

    private String fisrtName;
    private String lastName;
    private String email;
    private String birthMonth;
    private String birthDay;
    private String birthYear;
    private String language;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String computer;
    private String version;
    private String computer_language;
    private String mobile_device;
    private String model;
    private String mobile_os;

    private String password;
    private String password_confirm;
    private String completeSetup;


    public Data(String fisrtName, String lastName, String email, String birthMonth, String birthDay, String birthYear, String language, String city, String state, String zip, String country, String computer, String version, String computer_language, String mobile_device, String model, String mobile_os,
                String password, String password_confirm, String completeSetup) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.email = email;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.language = language;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
        this.computer = computer;
        this.version = version;
        this.computer_language = computer_language;
        this.mobile_device = mobile_device;
        this.model = model;
        this.mobile_os = mobile_os;
        this.password = password;
        this.password_confirm = password_confirm;
        this.completeSetup = completeSetup;
    }

    public String getFisrtName() {
        return fisrtName;
    }

    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(String birthYear) {
        this.birthYear = birthYear;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getComputer_language() {
        return computer_language;
    }

    public void setComputer_language(String computer_language) {
        this.computer_language = computer_language;
    }

    public String getMobile_device() {
        return mobile_device;
    }

    public void setMobile_device(String mobile_device) {
        this.mobile_device = mobile_device;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMobile_os() {
        return mobile_os;
    }

    public void setMobile_os(String mobile_os) {
        this.mobile_os = mobile_os;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword_confirm() {
        return password_confirm;
    }

    public void setPassword_confirm(String password_confirm) {
        this.password_confirm = password_confirm;
    }

    public String getCompleteSetup() {
        return completeSetup;
    }

    public void setCompleteSetup(String completeSetup) {
        this.completeSetup = completeSetup;
    }
}
