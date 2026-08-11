Feature: Copy and Paste Text

Scenario: Copy text using Copy button and paste into text file
    Given open url "https://www.w3schools.com/howto/howto_js_copy_clipboard.asp"
    When User clicks on Copy button
    And User pastes the copied text into text file
    Then User verifies the text in text file1