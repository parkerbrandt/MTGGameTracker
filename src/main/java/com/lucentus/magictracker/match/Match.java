package com.lucentus.magictracker.match;

import com.lucentus.magictracker.user.User;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


/**
 * Domain class to define properties of each match
 */
@Data
@NoArgsConstructor
public class Match {

    /**
     * Represent each Magic the Gathering format
     */
    public static enum Format {
        ALCHEMY("Alchemy", "ALC", 2, 1),
        BRAWL("Brawl", "BRL", 2, 1),
        CHIGHLANDER("Canadian Highlander", "CHD", 2, 1),
        COMMANDER("Commander", "EDH" ,4, 1),
        LEGACY("Legacy", "LGC", 2, 3),
        MODERN("Modern", "MDN", 2, 3),
        PAUPER("Pauper", "PPR", 2, 3),
        PIONEER("Pioneer", "PNR", 2, 3),
        STANDARD("Standard", "STD", 2, 3),
        VINTAGE("Vintage", "VTG", 2, 3);

        /*
         * Properties
         */
        @Getter
        private final String name;

        @Getter
        private final String id;

        @Getter
        private final int numPlayers;

        @Getter
        private final int bestOf;

        /*
         * Constructors
         */
        Format(String name, String id, int numPlayers, int bestof) {
            this.name = name;
            this.id = id;
            this.numPlayers = numPlayers;
            this.bestOf = bestof;
        }

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

    public Match(List<User> players) {
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
