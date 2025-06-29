package com.lucentus.magictracker.match;

import com.lucentus.magictracker.user.User;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


/**
 * Domain class to define properties of each match
 */
@Data
public class Match {

    /**
     * Represent each Magic the Gathering format
     */
    public static enum Format {
        ALCHEMY("Alchemy", "ALC", 2),
        BRAWL("Brawl", "BRL", 2),
        CHIGHLANDER("Canadian Highlander", "CHD", 2),
        COMMANDER("Commander", "EDH" ,4),
        LEGACY("Legacy", "LGC", 2),
        MODERN("Modern", "MDN", 2),
        PAUPER("Pauper", "PPR", 2),
        PIONEER("Pioneer", "PNR", 2),
        STANDARD("Standard", "STD", 2),
        VINTAGE("Vintage", "VTG", 2);
        
        /*
         * Properties
         */
        @Getter
        private String name;

        @Getter
        private String id;

        @Getter
        private int numPlayers;

        /*
         * Constructors
         */
        Format(String name, String id, int numPlayers) {
            this.name = name;
            this.id = id;
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
