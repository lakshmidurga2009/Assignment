Feature: Verifying the Login Feature

Scenario:
  Given User is on insure Page
  When User clicks on Gets Started button
  And User selects spouse radioButton
  And Clicks on Next button
  And Clicks Supplements life for spouse checkbox
  And Enter first name "John" last name "Doe" and click on Next button
  And Enter email id "john.doe@example.com"
  And Enter first name "John" last name "Doe" and click on Next button
  And select amount of Supplemental Coverage and click on Next button
  And Enter date of Birth "01/01/1980" and Click on Next button
  And select gender "Male" and Click on Next button
  And Enter Phone Number "8679897900" and click on Next button
  And Enter address "NewYorkStreet" and Apt "4B"
  And select consent and notice checkboxes and click on Next button
  And Enter height "5'3" and weight "75" and click on Next button
  And select No for pregnant
  And select no for taking medication
  And select None of the above for treatment
  And select None of the above for diagnosed
  And No for examined by any healthcare provider
  And enter first name "John" and last name "Doe"
  Then sign your application
