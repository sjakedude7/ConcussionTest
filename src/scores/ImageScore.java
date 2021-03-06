/**
 * CS-622 HW 2
 * ImageScore.java
 * Purpose: Holds the users score on the image test
 *
 * @author Jake Stephens
 * @version 1.0 2/11/2020
 */
package scores;

public class ImageScore extends Score {

    private int numCorrect;
    private int numMissed;

    public ImageScore() {
    }

    public ImageScore(int numCorrect, int numMissed) {
        this.numCorrect = numCorrect;
        this.numMissed = numMissed;
    }

    public void setNumCorrect(int numCorrect) { this.numCorrect = numCorrect; }

    public void setNumMissed(int numMissed) {
        this.numMissed = numMissed;
    }

    public int getNumCorrect() { return this.numCorrect; }

    public int getNumMissed() { return this.numMissed; }

    @Override
    public String printScore() {
        return "User got " + numCorrect + " correct and missed " + numMissed + " in image test";
    }

    @Override
    public void calculateScore() {
        this.percentageScore = 100 * ((double)numCorrect / ((double)numCorrect + (double)numMissed));
    }

    public String toString() {
        return "The user's image score numCorrect: " + this.numCorrect + " and numMissed: " + this.numMissed;
    }
}
