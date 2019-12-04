public class TennisGame {
    public TennisGame(String playerOneName, String playerTwoName){
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
    }

    public void PlayerMakesScore(Player player){
        player.setScore(player.getScore()+1);
    }
}
