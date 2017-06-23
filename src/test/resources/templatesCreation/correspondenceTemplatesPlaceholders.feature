Feature: Creating Correspondence Templates Placeholders.

  #Scenario Outline: Create SMS Placeholders
  #Given I am on CORE Admin site
  #When I want to create a "SMS corro" template
  #And I want to make the title "<Template Name>"
  #And I give the temp the discription "<Template Description>"
  #And I make the "Email" boy text "<SMS Corro Body>"
  #Then I can save it as a "SMS" template placeholder
  #
  #Examples:
  #| Template Name                                   | Template Description                                         | SMS Corro Bod                                                                                          |
  #| BR-SMS1 SMS Notify Application/Request Received | Template for Notifying that Application has been received.   | Application for Birth Certificate received. Ref No: $$Application Ref.                                 |
  #| BR-SMS2 SMS Notify Corro Sent to Email          | Template for Notifying that an Email Corrospondence is sent  | With regards to your Order $$OrderNo, a correspondence is sent to your email: $$Email address.. VICBDM |
  #| BR-SMS3 SMS Notify Corro Sent via Mail          | Template for Notifying that a Letter Correspondence is sent. | With regards to your Order $$OrderNo, a Letter Correspondence is sent to your address. VICBDM          |
  #| BR-SMS4 SMS to Submit BRS                       | Template for reminder text for BRS Submission                | Notice of Birth received on $$DateNOBReceived. Please register birth by applying online.               |
  #| DR-SMS1 SMS Notify Application/Request Received | Template for Notifying that Application has been received.   | Application for Death Certificate received. Ref No: $$Application Ref.                                 |
  #| DR-SMS2 SMS Notify Corro Sent to Email          | Template for Notifying that an Email Corrospondence is sent  | With regards to your Registration/Certificate, correspondence is sent to your email address VICBDM     |
  #| DR-SMS3 SMS Notify Corro Sent via Mail          | Template for Notifying that a Letter Correspondence is sent. | With regards to your Registration/Certificate, correspondence is mailed to your email address VICBDM   |
  Scenario Outline: Create Email Placeholders
    Given I am on CORE Admin site
    When I want to create a "Email corro" template
    And I want to make the title "<Template Name>"
    And I give the temp the discription "<Template Description>"
    And I link it to SMS "<Related SMS Template >"
    And I make the "Email" boy text "<Email Corro Body>"
    Then I can save it as a "SMS" template placeholder

    Examples: 
      | Template Name                    | Template Description                              | Email Corro Body                                         | Related SMS Template                   |
      | BR-Email1 Email - BRS Part1 Recd | Template for Notifying that BRS Part1 is received | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email2 Email - Request BR Part 2                                 | Template for requesting BRS Part2                                                                                                                         | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email3 Email - BRS Part2 Recd                                    | Template for acknowledge that BRS Part2 is received                                                                                                       | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email4 Email to Noify BR is Complete - No Cert                   | Template to notify that BR is compete - No Cert                                                                                                           | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email5 Email to Noify BR is Complete - With Cert                 | Template to notify that BR is compete - Cert Ordered dispatched                                                                                           | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email6 Email to seek Additional Info - Birth Registration        | Template to notify that additional information is required to proceed with Birth Registration assessment                                                  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email6 Email to Noify BR Certificate is Complete                 | Template to notify that BR Ceritifcate is compete                                                                                                         | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email8 Email to seek Additional Info - BR Certificate            | Template to notify that additional information is required to proceed with Birth Ceritifcate application assessment                                       | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email10 Email - Donor treatment is not held in Victoria.         | Template to advise that details of the donor treatment is not held in Victoria.                                                                           | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email11 Email - child name (prohibited name)                     | Template to advise that Child Name is a probihited name                                                                                                   | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email12 Email -  Parentage dispute                               | Template to advise that Parentage dispute is indicated on BRS submission                                                                                  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email13 Email - DHS for BRS                                      | Template to advise DHS to submit BRS                                                                                                                      | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email14 Email - BRS Part2 Not Recd                               | Template to inform that BRS Part2 is not yet received                                                                                                     | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email15 Email - BR Registered                                    | Template to inform that BR is registered without Parent 2 details                                                                                         | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| BR-Email16 Email - BR and NOB discripencies                         | Template to inform that information in BRS and NOB is not same                                                                                            | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | BR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email4 Email to Noify DR is Complete - No Cert                   | Template to Correspond with the Informant provided by the Funeral Director advising the completion of registration and Death certificate  can be ordered. | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email5 Email to Noify DR is Complete - With Cert                 | Template to Correspond with the Informant provided by the Funeral Director advising the completion of registration and Death certificate will be mailed.  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email6 Email to seek Additional Info - Death Registration        | Template to notify that additional information is required to proceed with Death Registration assessment                                                  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email7 Email to Noify BR Certificate is Complete                 | Template to notify that DR Ceritifcate is compete                                                                                                         | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email8 Email to seek Additional Info - DR Certificate            | Template to notify that additional information is required to proceed with Death Certificate application assessment                                       | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| BDR-Email9 Email Request to FD for DRS submission                   | Template to request FD to submit DRS                                                                                                                      | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email10 Email Request for MP for MCCD submission                 | Template to request Doctor to submit COD                                                                                                                  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. |                                        |
      #| DR-Email11 Email Request for DRS submission                         | Template to request Family Members to submit DRS                                                                                                          | Lorem ipsum dolor sit amet, consectetur adipiscing elit. |                                        |
      #| DR-Email12 Email Request for DRS submission                         | Template to request FD to submit DRS                                                                                                                      | Lorem ipsum dolor sit amet, consectetur adipiscing elit. | DR-SMS2 SMS Notify Corro Sent to Email |
      #| DR-Email13 Email Request for Medical Practioner for MCCD submission | Template to request Doctor to submit COD                                                                                                                  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. |                                        |
      #| DR-Email14 Email to Medical Practioner - Eligibility                | Template to request Doctor to submit COD                                                                                                                  | Lorem ipsum dolor sit amet, consectetur adipiscing elit. |                                        |
      #| DR-Email15 Email - COD and NOB discripencies                        | Template to Corrospond with Doctor (MCCPD) and Hospital (NOB) to advise that information on MCCPD inconsistent with NOB or BR or BRS                      | Lorem ipsum dolor sit amet, consectetur adipiscing elit. |                                        |
