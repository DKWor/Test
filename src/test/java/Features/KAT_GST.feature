Feature: Hotel Regression_TestCases

    @KAT_GST_TC
    Scenario: TC_01_KAT_GST_Simple Flow for set1
    Given User is on KAT GST Login Page with the "uat" environment
    When User SighnIn with username and password for Hotel Booking
    Then User click on GSTR1
    Then User click on GSTR1 File Upload
    Then User click on step1
    And User select the date
    Then User Upload the GL Income sheet
    Then User add remarks
    Then User save the changes
    Then user proceed step one
    And user upload SR file in step two
    Then User add remarks
    Then User save the changes
    Then user proceed for next step two
    Then user click on proceed to invoice button
    And user upload E invoice file in step three
    Then user proceed step three
    Then user click on step4
    And user upload Eway fiel on step4
    Then user proceed step four
    Then user click on step5
    And click on green button Q1
    And user upload Eway fiel on step5 Q1
    Then click on green button Q3
    And user upload Eway fiel on step5 Q3
    #Then user click on step6
    #And User click on red button as we working on set1
    Then user click on step7
    And user upload Liability Ledger  on step7
    Then User add remarks
    Then User save the changes
    Then User click on compare control sheet 3
    
    
    @KAT_GST_TC
    Scenario: TC_02_KAT_GST_Simple Flow for set2
    Given User is on KAT GST Login Page with the "uat" environment
    When User SighnIn with username and password for Hotel Booking
    Then User click on GSTR1
    Then User click on GSTR1 File Upload
    Then User click on step1
    And User select the date for set2
    Then User Upload the GL Income sheet
    Then User add remarks
    Then User save the changes
    Then user proceed step one
    And user upload SR file in step two
    Then User add remarks
    Then User save the changes
    Then user proceed for next step two
    Then user click on proceed to invoice button
    And user upload E invoice file in step three
    Then user proceed step three
    Then user click on step4
    And user upload Eway fiel on step4
    Then user proceed step four
    Then user click on step5
    And click on green button Q2
    And user upload Eway fiel on step5 Q2
    Then click on red button Q3
    Then click on green button Q4
    And user upload Eway fiel on step5 Q4
    Then user click on step6
    Then User click on greed button step6
    And Invoice Amendment Upload here
    Then user click on step7
    And user upload Liability Ledger set2 on step7 
    Then User add remarks
    Then User save the changes
    Then User click on compare control sheet 3
    
    
    
    
