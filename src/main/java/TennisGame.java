public class TennisGame {
    Player playerOne;
    Player playerTwo;
    String pointsArray[] = {"love", "fifteen", "thirty", "forty"};
    public TennisGame(String playerOneName, String playerTwoName){
        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);
    }

    public void playerWinBalls(Player player){
        player.setPlayerWinBalls(player.getPlayerWinBalls()+1);

    }
    
}
