package com.lucentus.magictracker.match;

import com.lucentus.magictracker.user.User;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


/**
 * Domain class to define properties of each match
 */
@Data
public class Match {

    public static enum Format {
        CHIGHLANDER,
        COMMANDER,
        LEGACY,
        MODERN,
        PAUPER,
        PIONEER,
        STANDARD,
        VINTAGE
    }

    /*
     * Properties
     */
    private String id;
    private Format format;
    private List<User> players;
    private List<String> comments;


    /*
     * Constructors
     */

    public Match(Format format, List<User> players) {
        this.format = format;
        this.players = players;

        this.id = generateMatchId();
        this.comments = new ArrayList<>();
    }


    /*
     * Methods
     */

    /**
     * TODO: Increment based off of newest
     * @return A unique new ID number for a match
     */
    private String generateMatchId() {
        return "0";
    }
}
