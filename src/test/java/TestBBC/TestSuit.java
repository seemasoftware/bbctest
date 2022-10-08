package TestBBC;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest{

    HomePage homePage= new HomePage();

    /*that I am on the BBC Sounds/Music Homepage
    When I select the ‘Sounds/Music’
    Then I am on the Sounds/Music Homepage
    And I can see ‘Music’ as Header name
    And I can see 8 section below ‘Music’ (Back To Back Sounds, Music Mixes, Match Your Mood, Feel Good Tunes, Dance Music, Dance Music, Music Categories, Reading + Leeds Festival 2022) /*See below screenshots */

    @Test
    public void HomePage() {
        homePage.VerifyUserIsOnHomePage();
    }


}
