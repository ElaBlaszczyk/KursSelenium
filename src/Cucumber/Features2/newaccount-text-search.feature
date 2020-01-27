Feature: New account on the Coders Guru website

Scenario: Creating an account

Given an open browser with https://tester.codersguru.pl
When zaloz konto buttom is selected
And  a keyword d.b66@poczta.pl is entered in input email field
And  a keyword Ela is entered in input name field
And  a keyword Blaszczyk is entered in input surname field
And  a keyword 12345 is entered in input password field
And  a keyword 12345 is entered in input repeatPassword field
And  a keyword Siemianowice is entered in input city field
And  a keyword 41-100 is entered in input Post-Code field
And  a keyword Szkolna is entered in input street field
And  a keyword 10 is entered in input house number field
And  Select akceptacja regulaminu
And  zarejestruj buttom is selected
Then an account should be created

And close browser


Scenario Outline: Creating an account

  Given an open browser with https://tester.codersguru.pl
  When zaloz konto buttom is selected
  And  a keyword <d.b66@poczta.pl> is entered in input email field
  And  a keyword <Ela> is entered in input name field
  And  a keyword <Blaszczyk> is entered in input surname field
  And  a keyword <12345> is entered in input password field
  And  a keyword <12345> is entered in input repeatPassword field
  And  a keyword <Siemianowice> is entered in input city field
  And  a keyword <41-100> is entered in input Post-Code field
  And  a keyword <Szkolna> is entered in input street field
  And  a keyword <10> is entered in input house number field
  And  Select akceptacja regulaminu
  And  zarejestruj buttom is selected
  Then an account should be created
  And close browser

  Examples:
    | d.b66@poczta.pl | Ela | Blaszczyk | 12345 | 12345 | Siemianowice | 41-100 | Szkolna | 10 |
    | adam@onet.pl    |Adam | Nowak     |45677   |45677   | Katowice     | 41-999 | Korfantego | 11|
    | monika@onet.pl   |Monika | Kowalska |12677   |12677   | Katowice     | 41-989 | Damrota | 9|