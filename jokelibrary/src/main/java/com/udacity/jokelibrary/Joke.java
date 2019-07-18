package com.udacity.jokelibrary;

import java.util.Random;

public class Joke {
    public static String getJoke() {
        // From url : https://chucknorrisfacts.net/top-100
        String[] jokes = {
                "Chuck Norris threw a grenade and killed 50 people, then it exploded.",
                "Chuck Norris can kill two stones with one bird.",
                "Chuck Norris can strangle you with a cordless phone.",
                "Chuck Norris was once charged with three attempted murders in Boulder County, but the Judge quickly dropped the charges because Chuck Norris does not \"attempt\" murder.",
                "Death once had a near-Chuck-Norris experience.",
                "Once a cobra bit Chuck Norris' leg. After five days of excruciating pain, the cobra died.",
                "When Chuck Norris was in middle school, his English teacher assigned an essay: \"What is courage?\" He received an A+ for turning in a blank page with only his name at the top.",
                "There is no theory of evolution, just a list of creatures Chuck Norris allows to live.",
                "Chuck Norris can pick oranges from an apple tree and make the best lemonade youve ever tasted.",
                "When a zombie apocalypse starts, Chuck Norris doesn't try to survive. The zombies do.",
                "Chuck Norris beat Halo 1, 2, and 3 on Legendary with a broken Guitar Hero controller.",
                "Chuck Norris can kill your imaginary friends.",
                "Chuck can set ants on fire with a magnifying glass. At night.",
                "Chuck Norris's daughter lost her virginity, he got it back.",
                "Chuck Norris can hear sign language.",
                "Chuck Norris makes onions cry.",
                "Chuck Norris knows Victoria's secret.",
                "Chuck Norris counted to infinity. Twice.",
                "Chuck Norris beat the sun in a staring contest.",
                "The reason the Holy Grail has never been recovered is because nobody is brave enough to ask Chuck Norris to give up his favourite coffee mug.",
                "When Bruce Banner gets mad he turns into the Hulk. When the Hulk gets mad he turns into Chuck Norris. When Chuck Norris gets mad, run.",
                "Chuck Norris is the reason Waldo is hiding.",
                "Chuck Norris's Blood Type is AK-47.",
                "Chuck Norris is the only person that can punch a cyclops between the eye.",
                "Brett Favre can throw a football over 50 yards. Chuck Norris can throw Brett Favre even further.",
                "Chuck Norris can build a snowman out of rain."
        };

        int jokePosition = new Random().nextInt(jokes.length);
        return jokes[jokePosition];
    }
}
