import java.util.*;
public class ActivitySelectionIfEndISNotSorted {
    public static void main(String[] args) {
        int start [] = {1,3,5,8,5,0};
        int end [] =   {2,4,7,9,9,6};

        int activities[][] = new int[start.length][3];
        for (int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];

        //        0     1     2
        // A0     0     10    20
        // A1     1     12    25
        // A2     2     20    30
        //       index  start   end
        }
        //lambda function -> shortform
        Arrays.sort(activities ,Comparator.comparingDouble(o->o[2])); //end time is sorted now

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct = 1;
        ans.add(activities[0][0]);
        int lastEnd = activities[0][2];

        for (int i = 1; i < end.length; i++) {
            if (activities[i][1] >= lastEnd) {
                //activity select
                maxAct++;
                ans.add(activities[i][0]); //storing index of the activity we are selecting to do
                lastEnd = activities[i][2];
            }
        }
        System.out.println("max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) +  " ");
        }
    }
}
