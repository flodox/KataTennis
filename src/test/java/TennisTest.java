import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TennisTest {
    TennisGame game = new TennisGame("Kim Clijsters", "Justine Henin");

    @Test
    public void testBeginPointShouldBeLove(){
        String playerOneScore = game.pointsToString(game.playerOne);
        String playerTwoScore = game.pointsToString(game.playerTwo);
        assertEquals("love", playerOneScore);
        assertEquals("love", playerTwoScore);
    }

    @Test
    public void testPlayerOneWinsFirstBall(){
        game.playerWinBalls(game.playerOne);
        String playerOneScore = game.pointsToString(game.playerOne);
        String playerTwoScore = game.pointsToString(game.playerTwo);
        assertEquals("fifteen", playerOneScore);
        assertEquals("love", playerTwoScore);
        assertEquals(false, game.douce);
        assertEquals(false, game.possibleWinner);
        assertEquals(null, game.winner);
    }

  @Test
  public void testLetThePlayersPlay(){
        game.playerWinBalls(game.playerOne);
        game.playerWinBalls(game.playerOne);
        game.playerWinBalls(game.playerTwo);
        game.playerWinBalls(game.playerTwo);
        assertEquals("thirty", game.pointsToString(game.playerOne));
        assertEquals("thirty", game.pointsToString(game.playerTwo));
        assertEquals(false, game.douce);
        assertEquals(false, game.possibleWinner);
        assertEquals(null, game.winner);
        assertEquals(null, game.playerWithAdvantage);
  }

  @Test
  public void testDouceShouldBeTrue(){
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      assertEquals("forty", game.pointsToString(game.playerOne));
      assertEquals("forty", game.pointsToString(game.playerTwo));
      assertEquals(true, game.douce);
      assertEquals(true, game.possibleWinner);
      assertEquals(null, game.winner);
      assertEquals(game.playerWithAdvantage, null);
  }

  @Test
    public void testAdvantageAndDouce(){
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      assertEquals("forty", game.pointsToString(game.playerOne));
      assertEquals("forty", game.pointsToString(game.playerTwo));
      assertEquals(true, game.douce);
      assertEquals(true, game.possibleWinner);
      assertEquals(null, game.winner);
      assertEquals(game.playerWithAdvantage, game.playerTwo);
      game.playerWinBalls(game.playerOne);
      assertEquals("forty", game.pointsToString(game.playerOne));
      assertEquals("forty", game.pointsToString(game.playerTwo));
      assertEquals(game.playerWithAdvantage, game.playerOne);
      assertEquals(true, game.douce);
      assertEquals(true, game.possibleWinner);
      assertEquals(null, game.winner);
  }

  @Test
    public void testPlayerTwoShouldWin() {
      //if you prefer Kim Clijsters, remove comment below, test will fail.
      //  game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerOne);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      assertEquals("forty", game.pointsToString(game.playerOne));
      assertEquals("forty", game.pointsToString(game.playerTwo));
      assertEquals(game.playerWithAdvantage, game.playerTwo);
      assertEquals(true, game.douce);
      assertEquals(true, game.possibleWinner);
      assertEquals(game.playerTwo, game.winner);

  }

  @Test
    public void testEasyWinGame(){
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      game.playerWinBalls(game.playerTwo);
      assertEquals(false, game.douce);
      assertEquals(true, game.possibleWinner);
      assertEquals(game.playerTwo, game.winner);
  }

}
