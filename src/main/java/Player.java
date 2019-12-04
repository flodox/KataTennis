public class Player {
    private String name;
    private int score;
    private int[] points = {0,10,15,30,40};
    
    public Player(String name){
        this.name = name;
        this.score = points[0];
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }
}
