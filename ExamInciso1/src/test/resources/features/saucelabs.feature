Feature: Login User
  @test1
  Scenario: Validate the title in page Products
    Given Get in the login page
    When Sign in with the user credentials, user:"standard_user" & password:"secret_sauce"
    Then Validate the title of home page should be "PRODUCTS"