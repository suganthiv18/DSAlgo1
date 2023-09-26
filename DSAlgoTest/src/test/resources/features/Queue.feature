Feature: Testing the Queue Page

  @tag1
Scenario Outline: User is able to navigate Queue 
		Given User click on Get started button in Queue module
		When User click on Implementation of Queue in Python
		And click Try here button and navigate to try edidor page
		When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
 
 @tag2
Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1|
    
 @tag3
 Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Implementation using collections text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0|
   
    @tag4
Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1| 
    
    @tag5
 Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Implementation using array text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0| 
 
  @tag6
Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1| 
    
  @tag7
  Scenario Outline: User is able to navigate to tryeditor page and run valid python code
    Given User click on Queue Operations text  
    And click Try here button and navigate to try edidor page
    When The user enter valid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should be presented with run result
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         0| 
    
  @tag8
  Scenario Outline: User is able to navigate to tryeditor page and run invalid python code
    Given The user is on try edidor page
    When The user enter invalid python code in tryEditor from sheet "<Sheetname>" and <RowNumber>
    And User click on run button
    Then User should get alert message
    Examples:
    |Sheetname | RowNumber|
    |Sheet2    |         1| 
    
  @tag9
  Scenario: User validating Practice Questions Page and navigate back to home page
   Given  The user is in Queue operations page
   When  User click on practice questons in Queue operations page
   Then  Navigate back to Queue operations page
   Then  Navigate back to Homepage 