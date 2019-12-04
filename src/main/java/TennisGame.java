public class TennisGame {
    Player playerOne;
    Player playerTwo;
    boolean possibleWinner;
    boolean douce;
    Player winner = null;
    Player playerWithAdvantage = null;
    String pointsArray[] = {"love", "fifteen", "thirty", "forty"};
    public TennisGame(String playerOneName, String playerTwoName){
        playerOne = new Player(playerOneName);
        playerTwo = new Player(playerTwoName);
    }

    public void playerWinBalls(Player player){

        player.setPlayerWinBalls(player.getPlayerWinBalls()+1);
        checkScore(player);
    }

    public void checkScore(Player player){
        if(player.getScore() == player.getPoints()[3]){
            possibleWinner = true;
        }

        if(player.getPlayerWinBalls() >= 4)
            if((playerOne.getPlayerWinBalls() - playerTwo.getPlayerWinBalls()) >= 2 || (playerTwo.getPlayerWinBalls() - playerOne.getPlayerWinBalls()) >=2)
                winner = player;
        if(possibleWinner && playerOne.getScore() == playerTwo.getScore()){
            douce = true;
        }
        if(douce && player.getPlayerWinBalls() > 3){
            if(player.equals(playerWithAdvantage))
            winner = player;
            else{
                playerWithAdvantage = player;
                player.setPlayerWinBalls(3);
            }

        }

    }

    public String pointsToString(Player player){
        if(winner != null && winner.equals(player)){
            System.out.println("winner: " + player.getName());
            return pointsArray[3];
        }
        return pointsArray[player.getPlayerWinBalls()];
    }

}
