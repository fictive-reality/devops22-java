package examples;

import java.util.ArrayList;
import java.util.List;

/**
 * A class that keeps a list of time intervals as pairs of floats, e.g.
 * [0.1, 3.2, 4.5, 6.0] means two intervals, one starting at 0.1s and 
 * ending at 3.2s, the other starting at 4.5s and ending at 6.0s.
 */
public class TimeIntervals {

    /**
     * Returns a list of intervals that fall within the given start and end time.
     * @param intervalList a list of time intervals e.g. [0.1, 3.2, 4.5, 6.0]
     * @param start the earliest time we want to accept intervals within
     * @param end the latest time we want to accept intervals within
     * @return a new list of floats with valid intervals
     */
    public static List<Float> getIntervalsBetween(float[] intervalList, float start, float end) {
        if (start < 0 || end < start)
            throw new IllegalArgumentException(String.format("Invalid start %s and end time %s", start, end));

        List<Float> newList = new ArrayList<Float>();
        for (int i = 0; i < intervalList.length; i += 2)
        {
            float s = intervalList[i];
            // We may have an unclosed interval at end, which means i+1 is not in the list.
            // If so, use 'end' to close the interval
            float e = i + 1 < intervalList.length ? intervalList[i + 1] : end;
            if (s >= start && e <= end)
            {
                newList.add(s - start);
                newList.add(e - start);
            }
        }
        return newList;
    }
}
