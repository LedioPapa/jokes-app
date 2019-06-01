package com.ledio.jokesapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * Created by Ledio Papa on 6/1/19
 */
//@Configuration
public class ChuckConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}
