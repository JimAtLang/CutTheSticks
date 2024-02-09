import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    Scanner sc;
    public static void main(String[] args){
        new Main();
    }

    public Main(){
        sc = new Scanner(System.in);
        int numSticks = sc.nextInt();
        ArrayList<Integer> sticks = new ArrayList<>();
        for(int i=0;i<numSticks; i++){
            sticks.add(sc.nextInt());
        }
        CutTheSticks cts = new CutTheSticks();
        cts.cut(sticks);
    }
}
