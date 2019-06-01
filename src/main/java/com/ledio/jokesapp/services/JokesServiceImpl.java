package com.ledio.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * Created by ledio on 5/8/19
 */
@Service
public class JokesServiceImpl implements JokesService {

    private ChuckNorrisQuotes quotes;

    public JokesServiceImpl(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getQuote() {
        return quotes.getRandomQuote();
    }
}
