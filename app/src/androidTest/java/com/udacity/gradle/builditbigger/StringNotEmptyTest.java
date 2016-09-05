package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;
import android.util.Log;

/**
 * Created by sanjaydixit on 05/09/16.
 */
public class StringNotEmptyTest extends AndroidTestCase {
    public void runTest() {
        String result = null;
        Log.d("BuildItBiggerTest","Running unit test to check if string is empty!");
        EndpointsAsyncTask asyncTask = new EndpointsAsyncTask();
        asyncTask.execute(getContext());
        try {
            result = asyncTask.get();
            Log.d("BuildItBiggerTest","Test success!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);
        assertTrue(result.length() != 0);
    }
}
