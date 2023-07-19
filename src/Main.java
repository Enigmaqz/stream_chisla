import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> positiveList = new ArrayList<>();
        for(int i = 0; i < intList.size(); i++) {
            if (intList.get(i) > 0) {
                positiveList.add(intList.get(i));
            }
        }
        List<Integer> evenList = new ArrayList<>();
        for(int i = 0; i < positiveList.size(); i++) {
            if (positiveList.get(i) % 2 == 0) {
                evenList.add(positiveList.get(i));
            }
        }
        Collections.sort(evenList);
        System.out.println(evenList);
    }
}
