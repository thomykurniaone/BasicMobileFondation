@SmokeTest

  Feature: Login

    Scenario: Verify Login with Valid Email Account (Manual Login)

      Given user click Masuk Button
      When user Logged in to MeGames Apps with email "akuntest.megames@gmail.com" and password "."
      And user click Masuk Button Again
      Then the MeGames Apps will have displayed CoPilot Displayed "Ayo mainkan game-game trandisional indonesia hingga game-game Internasional, dan dapatkan sertifikat dengan menyelesaikan Game tantangan miGa!"