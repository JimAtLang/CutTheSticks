import java.util.ArrayList;

public class CutTheSticks {
    public ArrayList<Integer> cut(ArrayList<Integer> sticks){
        ArrayList<Integer> rtrn = new ArrayList<>();
        int numSticks = sticks.size();
        int shortest = sticks.get(0);
        for(int stick:sticks){
            if(shortest<stick){
                stick = shortest;
            }
        }
        System.out.println("The shortest stick is " + shortest);
        return rtrn;
    }
}
