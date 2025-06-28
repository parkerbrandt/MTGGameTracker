package com.lucentus.magictracker.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;


/**
 * Simple data class for User data
 */
@Data
@RequiredArgsConstructor
public class User {

    private final String username;
    private String email;
    private String id;

}
