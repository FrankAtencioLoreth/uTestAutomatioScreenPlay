#Author: Frank Camilo Atencio Loreth
  @stories
  Feature: I As a user, I want to be able to register on the uTest platform
    @scenario1
    Scenario: Registration completed successfully
      Given The user accesses the homepage
      When The user fills in all the fields of the registration form
      Then User registration ends when the configuration setup button appears