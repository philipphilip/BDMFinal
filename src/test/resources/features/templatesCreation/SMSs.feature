Feature: Creating Correspondence Templates Placeholders for SMSs.

  Scenario Outline: Create SMS Placeholders
    Given I am on CORE Admin site
    When I want to create a "SMS corro" template
    And I want to make the title "<Template Name>" and the description "<Template Description>" and the "<Life Event>" and the "<doc type>"
    And I make the boy text "SMS" with template body "<SMS Body>"
    Then I can save the template placeholder

    Examples: 
      | Template Name | Template Description                                               | SMS Body                                                                     |
      | BR-SMS2       | Corro Template for reminder text for BRS Submission (7 days)       | Notice of Birth received. Please register birth by applying online.          |
      | BR-SMS3       | Corro Template for reminder text for BRS Submission (21 days)      | Notice of Birth received. Please register birth by applying online.          |
      | BR-SMS4       | Corro Template for BRS Submission to Commissioning Parents         | The text body need TBC                                                       |
      | GR-SMS1       | Corro Template for Notifying that an Email Correspondence is sent  | Regarding your submission a correspondence is sent to your email.VICBDM      |
      | GR-SMS2       | Corro Template for Notifying that a Letter Correspondence is sent. | Regarding your submission correspondence is sent to your mail address.VICBDM |
