package com.udacity.gradle.builditbigger;

import java.util.Random;

public class Joker {

    private Random rand = new Random();
    private String[] jokesList = {"There are 10 types of people in the world: those who understand binary, and those who don’t.",
            "Q: Why is it that programmers always confuse Halloween with Christmas?\n" +
                    "A: Because 31 OCT = 25 DEC.", "Q: How many programmers does it take to change a light bulb?\n" +
            "A: None. It’s a hardware problem.", "A logician tells a colleague his wife just had a baby.\n" +
            "– Is it a boy or a girl?\n" +
            "– Yes.", "Lotteries are a tax on people who suck at math.\n" +
            "\n"};

    public String tellJoke() {
        return jokesList[rand.nextInt(jokesList.length)];
    }

}
