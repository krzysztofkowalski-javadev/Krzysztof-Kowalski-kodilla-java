package testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    List<Integer> evenList;

    public OddNumbersExterminator() {
        evenList = new ArrayList<Integer>();
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        int temporaryValue = 0;

        for (int n = 0; n < numbers.size(); n++) {
            temporaryValue = numbers.get(n);
            if (temporaryValue % 2 == 0) {
                evenList.add(temporaryValue);
            }
        }
            return evenList;
        }
        public List<Integer> getEvenList () {
            return evenList;
        }
    }

