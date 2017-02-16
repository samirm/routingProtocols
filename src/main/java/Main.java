import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by smammadov on 2/15/17.
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] nodeNames = in.nextLine().split(", ");
        ArrayList<Router> routers = new ArrayList<>(nodeNames.length);

        for (String nodeName : nodeNames) {
            String[] costs = in.nextLine().split(", ");
            routers.add(new Router(nodeName, Arrays.stream(costs).map(String::trim).mapToInt(Integer::parseInt).toArray()));
        }
    }
}
