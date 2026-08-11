Feature: Copy and Paste Text

Scenario: Copy text using Copy button and paste into text file
    Given open url without_tookkit "https://www.w3schools.com/howto/howto_js_copy_clipboard.asp"
    When User clicks on Copy button without_TookKit
    And User pastes the copied text into text file without_TookKit
    Then User verifies the text in text file without_TookKit