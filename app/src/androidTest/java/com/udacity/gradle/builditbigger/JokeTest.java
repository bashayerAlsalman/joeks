package com.udacity.gradle.builditbigger;

import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;


import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;

@RunWith(AndroidJUnit4.class)
public class JokeTest {

    @Rule
    public ActivityTestRule<MainActivity> activityRule =
            new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAsyncTask() {
        EndpointAsyncTask asyncTask = new EndpointAsyncTask(activityRule.getActivity()) {
            @Override
            protected void onPostExecute(String result) {
                assertNotNull("joke is null: ", result);
                assertTrue("joke is empty: ", !result.isEmpty());
            }
        };
        asyncTask.execute();
    }

}
