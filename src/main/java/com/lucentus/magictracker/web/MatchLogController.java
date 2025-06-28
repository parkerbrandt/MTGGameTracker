package com.lucentus.magictracker.web;

import com.lucentus.magictracker.match.Match;
import com.lucentus.magictracker.user.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;


/**
 * Handles requests for all match logging
 */
@Slf4j
@Controller
@RequestMapping("/log")
public class MatchLogController {

    @GetMapping
    public String showLogForm(Model model) {
        List<User> players = Arrays.asList(
                new User("Player 1"),
                new User("Player 2"),
                new User("Player 3"),
                new User("Player 4")
        );

        List<String> comments = Arrays.asList("");

        model.addAttribute(
                "logmatch",
                new Match(Match.Format.COMMANDER, players)
        );

        return "logmatch";
    }

}
