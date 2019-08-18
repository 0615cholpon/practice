package wednesdayRecap;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lock {
    public static void main(String[] args) {
        Set<Integer> scores = new HashSet<>();
        scores.add(5);
        scores.add(12);
        scores.add(10);
        scores.add(3);
        System.out.println(scores);
        Iterator<Integer> scoreIterator = scores.iterator();
        scoreIterator.next();
        System.out.println(scoreIterator.next());
    }
}
