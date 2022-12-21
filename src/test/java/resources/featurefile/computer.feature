Feature: Computer Test
  As a user I want to go on computer page

  @smoke,@regression
Scenario: Verify user should navigate to computer page successfully
  Given I am on homepage
  When I click on Computer Tab
  Then I verify Computer text

    @sanity,@regression
  Scenario : Verify user should navigate to Desktop page successfully
  Given I am on homepage
  When I click on Computer Tab
  And I click on Desktop link
  Then I verify Desktop text

      @regression
  Scenario Outline: Verify that user should build your own Computer and add to cart successfully
  Given I am on homepage
  When I click on Computer Tab
  And I click on Desktop link
  And I select product "build your own computer"
  And I select processor"<processor>"
  And I select RAM "<ram>"
  And I select HDD"<hdd>"
  And I select OS "<os>"
  And I select software "<software>"
  And I click on Add to Cart Button
  Then I can add product to cart successfully
Examples:
| processor                                       | ram           | hdd               | os                      | software                   |
| 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
| 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista  Home [+$50.00]   | Total Commander [+$5.00]   |

