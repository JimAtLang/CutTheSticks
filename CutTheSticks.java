import java.util.ArrayList;

public class CutTheSticks {
    public ArrayList<Integer> cut(ArrayList<Integer> sticks){
        ArrayList<Integer> rtrn = new ArrayList<>();
        int numSticks = sticks.size();
        int shortest = sticks.get(index:0);
        for(int stick:sticks){
            if(shortest>stick){
                shortest = stick;
            }
        }
        System.out.println("The shortest stick is + ")
        return rtrn;
    }
}
