#Author: Frank Camilo Atencio Loreth
  @stories
  Feature: I As a user, I want to be able to register on the uTest platform
    @scenario1
    Scenario: Registration completed successfully
      Given The user accesses the homepage
      When The user fills in all the fields of the registration form
        | fisrtName | lastName | email                 | birthMonth | birthDay | birthYear | language | city     | state     | zip    | country  | computer | version    | computer_language | mobile_device | model   | mobile_os  | password        | password_confirm |
        | Frank     | Atencio  | exampleTest@gmail.com | April      | 16       | 1998      | Spanish  | El Bagre | Antioquia | 052430 | Colombia | Windows  | Windows 11 | English           | Xiaomi        | Poco F3 | Android 12 | $Z..3fRjDvhQ5TL | $Z..3fRjDvhQ5TL  |
      Then User registration ends when the configuration setup button appears
        | completeSetup  |
        | Complete Setup |