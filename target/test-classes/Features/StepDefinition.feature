Feature: Run adactin hotel with differrent scenario

  Scenario Outline: Verifying the login credential
    Given I am entering the Adactin hotel login webpage
    When I am giving the "<Username>","<Password>"

    Examples: 
      | Username           | Password   |
      | krishnakrishna1177 | balaji1514 |
@reg
  Scenario Outline: 1 Verifying the Hotel Searching
    Given I am entering the Adactin hotel app home page
    When user enter the "<Location>" , "<Hotels>" ,"<Room Type>" , "<Number of Rooms>", "<Check In Date>" , "<Check Out Date>", "<Adults per Room>" , "<Children per Room>"
    When user should select the hotel from the webtable
    When user entering personal details "<First Name>","<Last Name>","<Billing Address>","<Credit Card No>","<Credit Card Type>", "<Expiry month>","<Expiry year>","<CVV Number>"
    Then click search hotel button

    Examples: 
      | Location | Hotels      | Room Type | Number of Rooms | Check In Date | Check Out Date | Adults per Room | Children per Room | First Name | Last Name | Billing Address   | Credit Card No   | Credit Card Type | Expiry month | Expiry year | CVV Number |
      | Sydney   | Hotel Creek | Standard  | 1 - One         | 01/09/2020    | 02/09/2020     | 1 - One         | 0 - None          | Balaji     | G         | 5/54 erode 641659 | 9876543219876543 | VISA             | July         |        2020 |        544 |
