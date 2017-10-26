Feature: Creating Correspondence Templates Placeholders for SMSs.

  Scenario Outline: Create SMS Placeholders
    Given I am on CORE Admin site
    When I want to create a "SMS corro" template
    And I want to make the title "<Template Name>" and the description "<Template Description>" and the "<Life Event>" and the "<doc type>"
    And I make the boy text "SMS" with template body "<Template Body>"
    Then I can save the template placeholder

    Examples: 
      | Template Name                           | Template Description                                          | Template Body                                    |
      | This is test only for   creation of SMS | This is also a test only description of the SMS created taken | SMS sample tesxt to be send to the mobile number |
      #| SMS Notify Application/Request Received | Corro Template for Notifying that Application has been received.   | SMS Application for Birth  Certificate received.                                        |
      #| SMS Notify Corro Sent to Email          | Corro Template for Notifying that an Email Correspondence is sent  | SMS Regarding your bubmission a correspondence is sent to your email.VICBDM             |
      #| SMS Notify Corro Sent via Mail          | Corro Template for Notifying that a Letter Correspondence is sent. | SMS Regarding your bubmission a correspondence is sent to your .VICBDM                  |
      #| SMS to Submit BRS                       | Corro Template for reminder text for BRS Submission                | SMS Notice of Birth received. Please register birth by applying online.                 |
      #| SMS to Submit BRS                       | Corro Template for reminder text for BRS Submission                | SMS Notice of Birth received. Please register birth by applying online.                 |
      #| SMS Notify Application/Request Received | Corro Template for Notifying that Application has been received.   | SMS Application for Death Certificate received. VICBDM                                  |
      #| SMS Notify Corro Sent to Email          | Template for Notifying that an Email Corrospondence is sent        | SMS With regards to your submission correspondence is sent to your email address VICBDM |
      #| SMS Notify Corro Sent via Mail          | Template for Notifying that a Letter Correspondence is sent.       | SMS With regards to your submission correspondence is sent to your address.VICBDM       |
