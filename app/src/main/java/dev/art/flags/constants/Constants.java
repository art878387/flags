package dev.art.flags.constants;

import java.util.Arrays;
import java.util.List;

public class Constants {
    public static final List LIST_OF_COUNTS = Arrays.asList(10, 30, 50, 100);
    public static final List LIST_OF_SECONDS = Arrays.asList(60, 30, 10, 5);

    public static final int EASY_MODE_NUM = 10; // NUMBER OF QUESTION IN EASY MODE
    public static final int MEDIUM_MODE_NUM = 30;
    public static final int HARD_MODE_NUM = 50;
    public static final int HARDEST_MODE_NUM = 100;

    public static final int SLOW_SPEED = 60; // SECONDS OF EACH QUESTION DISPLAYS
    public static final int MEDIUM_SPEED = 30;
    public static final int FAST_SPEED = 10;
    public static final int FASTEST_SPEED = 5;

    public static final String FACEBOOK_URL = "https://www.facebook.com/geogame";
    public static final String FACEBOOK_PAGE_ID = "geogame";
    public static final String RATE_MSG = "Thanks for your rate!";
    public static final String RESET_DONE_MSG = "Scores are reset!";

    public static final String ACTIVE_CLASSIC = "Classic";
    public static final String ACTIVE_REVERT = "Revert";
    public static final String ACTIVE_CAPITALS = "Capitals";

    public static final String PLAY_COUNT_TABLE = "UserPlayCount";
    public static final String RANKING_TABLE = "Ranking";

    public static final String EMPTY_SCORES = "Empty score list !";

    public static final String NOTE = "<font color=#fa3c3f>Note: </font> <font color=#217DAE>If selected count of questions more than exists in the database, then will be shown the maximum count of existing questions. It refer only Capitals play mode.</font>";
}
