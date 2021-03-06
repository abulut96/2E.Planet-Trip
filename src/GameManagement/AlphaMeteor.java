package GameManagement;

import java.io.IOException;

/**
 * @author Serdar Taskafa
 * This type of meteors are destroyed after one hit
 * Note: We may want to add hit count as a variable
 */
public class AlphaMeteor extends DestructibleMeteor {
    // Constants
    public static final int SCORE_ALPHA = 100;  // Score is set to 100 as default.

    // Constructor
    public AlphaMeteor(float xPosition, float yPosition) throws IOException {
        super(xPosition, yPosition, "images/AlphaMeteor.png");
    }

    public int getScore() {
        return SCORE_ALPHA;
    }
}
