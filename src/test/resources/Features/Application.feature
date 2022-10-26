@testing
Feature: ILab Assessment

@wer
  Scenario Outline: Job Application to ILab


    Given I want to apply from ILab side
#  And select south Africa link
#    And select the the advertised Jobs
#    And I type in my personal details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
    Then i should be able to submit the application and quite the browser


    Examples:
      | applicatName |surname| emailAddress							  |message|
      | Priscilla    |Muleya | automationAssessment@iLabQuality.com   | I am respoding to the advitised position|

  @testing2
  Scenario Outline: Job Application to training2


    Given I want to click training
    And I click on contact us
#    And I type in my personal details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
    And I type in my details "<applicatName>" and "<surname>" "<emailAddress>" "<message>"
#    Then i should be able to submit the application and quite the browser


    Examples:
      | applicatName |surname| emailAddress							  |message|
      | Priscilla    |Muleye | automationAssessment@iLabQuality.com   | I am respoding to the advitised position|
