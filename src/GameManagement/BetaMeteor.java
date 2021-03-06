package GameManagement;

import java.io.IOException;

/**
 * @author Serdar Taskafa
 * This type of meteors are destroyed after two hits
 * Note: We may want to add hit count as a variable
 */
public class BetaMeteor extends DestructibleMeteor {
    // Constants
    public static final int SCORE_BETA = 200;  // Score is set to 200 as default.

    // Constructor
    public BetaMeteor(float xPosition, float yPosition) throws IOException {
        super(xPosition, yPosition, "images/BetaMeteor.png");
    }

    public int getScore() {
        return SCORE_BETA;
    }
}
