Feature: Creating Correspondence Templates Placeholders.

  Scenario Outline: Create SMS Placeholders
  Given I am on CORE Admin site
  When I want to create a "SMS corro" template
  And I want to make the title "<CORRO ID>"
  And I give the temp the discription "<Template Description>"
  And I make the boy text "<Template Body>"
  Then I can save it as a "SMS" template placeholder
  
  Examples:
  | Template Id | CORRO ID | Template Name                           | Template Description                                               | Template Type | Template Body                                                                       |
  | BR-SMS1     | CRPBR118 | SMS Notify Application/Request Received | Corro Template for Notifying that Application has been received.   | SMS           | SMS Application for Birth  Certificate received.                                        |
  | BR-SMS2     | CRPBR101 | SMS Notify Corro Sent to Email          | Corro Template for Notifying that an Email Correspondence is sent  | SMS           | SMS Regarding your bubmission a correspondence is sent to your email.VICBDM             |
  | BR-SMS3     | CRPBR119 | SMS Notify Corro Sent via Mail          | Corro Template for Notifying that a Letter Correspondence is sent. | SMS           | SMS Regarding your bubmission a correspondence is sent to your .VICBDM                  |
  | BR-SMS4     | CRPBR018 | SMS to Submit BRS                       | Corro Template for reminder text for BRS Submission                | SMS           | SMS Notice of Birth received. Please register birth by applying online.                 |
  | BR-SMS5     | CRPBR019 | SMS to Submit BRS                       | Corro Template for reminder text for BRS Submission                | SMS           | SMS Notice of Birth received. Please register birth by applying online.                 |
  | DR-SMS1     | CRPAP001 | SMS Notify Application/Request Received | Corro Template for Notifying that Application has been received.   | SMS           | SMS Application for Death Certificate received. VICBDM                                  |
  | DR-SMS2     | CRPBR120 | SMS Notify Corro Sent to Email          | Template for Notifying that an Email Corrospondence is sent        | SMS           | SMS With regards to your submission correspondence is sent to your email address VICBDM |
  | DR-SMS3     | CRPBR121 | SMS Notify Corro Sent via Mail          | Template for Notifying that a Letter Correspondence is sent.       | SMS           | SMS With regards to your submission correspondence is sent to your address.VICBDM       |
  Scenario Outline: Create Email Placeholders
  Given I am on CORE Admin site
  When I want to create a "letter corro" template
  And I want to make the title "<Template Name>"
  And I give the temp the discription "<Template Description>"
  And I make the boy text "<Letter Corro Body>"
  Then I can save it as a "Letter" template placeholder
  
  Examples:
  | Template Id | Template Name                                             | Template Description                                                                                                                                      | Letter Corro Body         |
  | BR-Letter1  | Letter - BRS Part1 Recd                                   | Template for Notifying that BRS Part1 is received                                                                                                         | THe letter text body of letter1  |
  | BR-Letter2  | Letter - Request BR Part2                                 | Template for requesting BRS Part2                                                                                                                         | THe letter text body of letter2  |
  | BR-Letter3  | Letter - BRS Part2 Recd                                   | Template for acknowledge that BRS Part2 is received                                                                                                       | THe letter text body of letter3  |
  | BR-Letter4  | Letter to Noify BR is Complete - No Cert                  | Template to notify that BR is compete - No Cert                                                                                                           | THe letter text body of letter4  |
  | BR-Letter5  | Letter to Noify BR is Complete - With Cert                | Template to notify that BR is compete - Cert Ordered dispatched                                                                                           | THe letter text body of letter5  |
  | BR-Letter6  | Letter to seek Additional Info - Birth Registration       | Template to notify that additional information is required to proceed with Birth Registration assessment                                                  | THe letter text body of letter6  |
  | BR-Letter7  | Letter to Noify BR Certificate is Complete                | Template to notify that BR Certificate is complete                                                                                                        | THe letter text body of letter7  |
  | BR-Letter9  | Letter to seek Additional Info - BR Certificate           | Template to notify that additional information is required to proceed with Birth Ceritifcate application assessment                                       | THe letter text body of letter8  |
  | BR-Letter10 | Letter - Donor treatment is not held in Victoria.         | Template to advice that details of the donor treatment is not held in Victoria.                                                                           | THe letter text body of letter9  |
  | BR-Letter11 | Letter - child name (prohibited name)                     | Template to advise that Child Name is a probihited name                                                                                                   | THe letter text body of letter10 |
  | BR-Letter12 | Letter - Parentage dispute                                | Template to advise that Parentage dispute is indicated on BRS submission                                                                                  | THe letter text body of letter11 |
  | BR-Letter13 | Letter - DHS for BRS                                      | Template to advise DHS to submit BRS                                                                                                                      | THe letter text body of letter12 |
  | BR-Letter14 | Letter - BRS Part2 Not Recd                               | Template to inform that BRS Part2 is not yet received                                                                                                     | THe letter text body of letter13 |
  | BR-Letter15 | Letter - BRS Part2 Not Recd                               | Template to inform that BR is registered without Parent2 details                                                                                          | THe letter text body of letter14 |
  | BR-Letter16 | Letter - BR and NOB discripencies                         | Template to inform that information in BRS and NOB is not same                                                                                            | THe letter ext body of letter15 |
  | DR-Letter4  | Letter to Noify DR is Complete - No Cert                  | Template to Correspond with the Informant provided by the Funeral Director advising the completion of registration and Death certificate  can be ordered. | THe letter text body of letter16 |
  | DR-Letter5  | Letter to Noify DR is Complete - With Cert                | Template to Correspond with the Informant provided by the Funeral Director advising the completion of registration and Death certificate will be mailed.  | THe letter text body of letter17 |
  | DR-Letter6  | Letter to seek Additional Info - Death Registration       | Template to notify that additional information is required to proceed with Death Registration assessment                                                  | THe letter text body of letter18 |
  | DR-Letter7  | Letter to Noify BR Certificate is Complete                | Template to notify that DR Certificate is complete                                                                                                        | THe letter text body of letter19 |
  | DR-Letter8  | Letter to seek Additional Info - DR Certificate           | Template to notify that additional information is required to proceed with Death  Certificate application assessment                                      | THe letter text body of letter20 |
  | DR-Letter9  | Letter Request to FD for DRS submission                   | Template to request FD to submit DRS                                                                                                                      | THe letter text body of letter21 |
  | DR-Letter10 | Letter Request for MP for MCCD submission                 | Template to request Doctor to submit COD                                                                                                                  | THe letter text body of letter22 |
  | DR-Letter11 | Letter Request for DRS submission                         | Template to request Family Members to submit DRS                                                                                                          | THe letter text body of letter23 |
  | DR-Letter12 | Letter Request for DRS submission                         | Template to request FD to submit DRS                                                                                                                      | THe letter text body of letter24 |
  | DR-Letter13 | Letter Request for Medical Practioner for MCCD submission | Template to request Doctor to submit COD                                                                                                                  | THe letter text body of letter25 |
  | DR-Letter14 | Letter to Medical Practioner - Eligibility                | Template to request Doctor to submit COD                                                                                                                  | THe letter text body of letter26 |
  | DR-Letter15 | Letter - COD and NOB discripencies                        | Template to Corrospond with Doctor (MCCPD) and Hospital (NOB) to advise that information on MCCPD inconsistent with NOB or BR or BRS                      | THe letter text body of letter27 |
  Scenario Outline: Create Email Placeholders
    Given I am on CORE Admin site
    When I want to create a "Email corro" template
    And I want to make the title "<CORRO ID>"
    And I give the temp the discription "<Template Description>"
    And I make the boy text "<Letter Corro Body>"
    Then I can save it as a "Letter" template placeholder

    Examples: 
      | Template Id From cliente | CORRO ID | Template Name                                            | Template Description                                                                                                                                        |
      | BR-Email1                | CRPBR001 | Email - BRS Part1 Recd                                   | Template for Notifying that BRS Part 1 is received                                                                                                          |
      | BR-Email2                | CRPBR003 | Email - Request BR Part 2                                | Template for requesting BRS Part 2                                                                                                                          |
      | BR-Email3                | CRPBR009 | Email - BRS Part2 Recd                                   | Template for acknowledge that BRS Part 2 is received                                                                                                        |
      | BR-Email4                | CRPBR024 | Email to Noify BR is Complete - No Cert                  | Template to notify that BR is compete - No Cert                                                                                                             |
      | BR-Email5                | CRPBR023 | Email to Noify BR is Complete - With Cert                | Template to notify that BR is compete - Cert Ordered dispatched                                                                                             |
      | BR-Email6                | CRPBR102 | Email to seek Additional Info - Birth Registration       | Template to notify that additional information is required to proceed with Birth Registration assessment                                                    |
      | BR-Email6                | CRPBR103 | Email to Noify BR Certificate is Complete                | Template to notify that BR Ceritifcate is compete                                                                                                           |
      | BR-Email8                | CRPBR104 | Email to seek Additional Info - BR Certificate           | Template to notify that additional information is required to proceed with Birth Ceritifcate application assessment                                         |
      | BR-Email10               | CRPBR007 | Email - Donor treatment is not held in Victoria.         | Template to advise that details of the donor treatment is not held in Victoria.                                                                             |
      | BR-Email11               | CRPBR020 | Email - child name (prohibited name)                     | Template to advise that Child Name is a probihited name                                                                                                     |
      | BR-Email12               | CRPBR016 | Email -  Parentage dispute                               | Template to advise that Parentage dispute is indicated on BRS submission                                                                                    |
      | BR-Email13               | CRPBR105 | Email - DHS for BRS                                      | Template to advise DHS to submit BRS                                                                                                                        |
      | BR-Email14               | CRPBR106 | Email - BRS Part2 Not Recd                               | Template to inform that BRS Part 2 is not yet received                                                                                                      |
      | BR-Email15               | CRPBR107 | Email - BR Registered                                    | Template to inform that BR is registered without Parent 2 details                                                                                           |
      | BR-Email16               | CRPBR108 | Email - BR and NOB discripencies                         | Template to inform that information in BRS and NOB is not same                                                                                              |
      | DR-Email4                | CRPDR002 | Email to Noify DR is Complete - No Cert                  | Template to Correspond with the 'Informant' provided by the Funeral Director advising the completion of registration and Death certificate  can be ordered. |
      | DR-Email5                | CRPDR001 | Email to Noify DR is Complete - With Cert                | Template to Correspond with the 'Informant' provided by the Funeral Director advising the completion of registration and Death certificate will be mailed.  |
      | DR-Email6                | CRPBR122 | Email to seek Additional Info - Death Registration       | Template to notify that additional information is required to proceed with Death Registration assessment                                                    |
      | DR-Email7                | CRPBR109 | Email to Noify BR Certificate is Complete                | Template to notify that DR Ceritifcate is compete                                                                                                           |
      | DR-Email8                | CRPBR110 | Email to seek Additional Info - DR Certificate           | Template to notify that additional information is required to proceed with Death Certificate application assessment                                         |
      | DR-Email9                | CRPBR111 | Email Request to FD for DRS submission                   | Template to request FD to submit DRS                                                                                                                        |
      | DR-Email10               | CRPBR112 | Email Request for MP for MCCD submission                 | Template to request Doctor to submit COD                                                                                                                    |
      | DR-Email11               | CRPBR113 | Email Request for DRS submission                         | Template to request Family Members to submit DRS                                                                                                            |
      | DR-Email12               | CRPBR114 | Email Request for DRS submission                         | Template to request FD to submit DRS                                                                                                                        |
      | DR-Email13               | CRPBR115 | Email Request for Medical Practioner for MCCD submission | Template to request Doctor to submit COD                                                                                                                    |
      | DR-Email14               | CRPBR116 | Email to Medical Practioner - Eligibility                | Template to request Doctor to submit COD                                                                                                                    |
      | DR-Email15               | CRPBR117 | Email - COD and NOB discripencies                        | Template to Corrospond with Doctor (MCCPD) and Hospital (NOB) to advise that information on MCCPD inconsistent with NOB or BR or BRS                        |
