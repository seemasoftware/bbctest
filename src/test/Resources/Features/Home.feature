Feature: Sounds/Music Homepage
  As a user
  I WANT to navigate to the Sounds/Music page
  So THAT I can see and access all logos and content in one place

  @todo1
  Scenario: Verify Sounds/Music header
    Given that I am on the BBC Sounds/Music Homepage
    When I select the ‘Sounds/Music’
    Then I am on the Sounds/Music Homepage
    And I can see ‘Music’ as Header name
    And I can see 8 section below ‘Music’ (Back To Back Sounds, Music Mixes, Match Your Mood, Feel Good Tunes, Dance Music, Dance Music, Music Categories, Reading + Leeds Festival 2022) /*See below screenshots */



  @todo1
  Scenario: Selecting the Classical category from the Music Categories module
  on the Sounds/Music Homepage
    Given that I am on the BBC Sounds/Music Homepage
    When I select Classical Category
    Then I am on ‘BBC Sounds - Categories - Classical’ Category page
    And I see the BBC Sounds - Categories – Classical  page is sorted by popular /*See below screenshot*/
