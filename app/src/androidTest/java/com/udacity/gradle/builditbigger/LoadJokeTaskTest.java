package com.udacity.gradle.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

import static junit.framework.Assert.assertNotNull;

@RunWith(AndroidJUnit4.class)
public class LoadJokeTaskTest {
    @Rule
    public ActivityTestRule<MainActivity> activityTestRule =
            new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testAsyncTask() throws InterruptedException, ExecutionException {
        LoadJokeTask loadJokeTask = new LoadJokeTask(new LoadJokeTask.DataListener() {
            @Override
            public void onDataLoaded(String result) {

            }
        });
        loadJokeTask.execute();

        String joke = loadJokeTask.get();

        assertNotNull(joke);
    }
}
