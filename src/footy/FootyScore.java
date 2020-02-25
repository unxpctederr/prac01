package footy;

public class FootyScore {
    private int goals;
    private int behinds;

    public FootyScore() {
        goals = 0;
        behinds = 0;
    }

    public int getPoints(){
        return((goals * 6 + behinds));
    }

    public void kickGoal(){
        goals++;
    }

    public void kickBehind(){
        behinds++;
    }

    public String sayScore(){
       return(String.format("%d, %d, %d", goals, behinds, getPoints()));
    }

    public boolean inFrontOf(FootyScore otherTeam){
        return(getPoints() > otherTeam.getPoints());
    }

}