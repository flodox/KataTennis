public class Player {
    private String name;
    private int score;
    private int playerWinBalls;
    private int[] points = {0,10,15,30,40};

    public Player(String name){
        this.name = name;
        this.score = points[0];
        this.playerWinBalls = 0;
    }

    public int getPlayerWinBalls() {
        return playerWinBalls;
    }

    public void setPlayerWinBalls(int playerWinBalls) {
        this.playerWinBalls = playerWinBalls;
        setScore(this.playerWinBalls);
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = getPoints()[score];
    }

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }


}
