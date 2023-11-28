package pl.coderslab.model;

public class PlayerStatsInfo {

    private String firstName;
    private String lastName;
    private double pointsAverage;
    private double assistAverage;
    private double reboundAverage;

    public PlayerStatsInfo(String firstName, String lastName, double pointsAverage, double assistAverage, double reboundAverage) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pointsAverage = pointsAverage;
        this.assistAverage = assistAverage;
        this.reboundAverage = reboundAverage;
    }

    public PlayerStatsInfo() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getPointsAverage() {
        return pointsAverage;
    }

    public void setPointsAverage(double pointsAverage) {
        this.pointsAverage = pointsAverage;
    }

    public double getAssistAverage() {
        return assistAverage;
    }

    public void setAssistAverage(double assistAverage) {
        this.assistAverage = assistAverage;
    }

    public double getReboundAverage() {
        return reboundAverage;
    }

    public void setReboundAverage(double reboundAverage) {
        this.reboundAverage = reboundAverage;
    }
}
