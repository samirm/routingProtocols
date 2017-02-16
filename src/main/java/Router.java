
/**
 * Created by smammadov on 2/15/17.
 *
 */
public class Router extends Thread{
    private String name;
    private int[] costs;

    /**
     *
     * @param name
     * @param costs
     */
    public Router(final String name, final int[] costs){
        this.name = name;
        this.costs = costs;
    }

    public void printCosts(){
        for (int i = 0; i < costs.length; i++){
            System.out.println("Cost from " + name + " to " + i + " is " + costs[i]);
        }
    }
}