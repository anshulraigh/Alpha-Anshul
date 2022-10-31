import java.util.ArrayList;
public class ActivitySelection{// [FaceBook, MorganStainley, FlipKart]
    /*
     * You are given n activities with their start and end times . select the maximum number 
     * of activities that can be performed by a single person, assuming that a person can only
     * work a single activity at a time. Activities are sorted according to end time
     */
    public static void main(String[] args) {
        int start [] = {1,3,0,5,8,5};
        int end [] =   {2,4,6,7,9,9};

        // sorted end we have
        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // 1st activity
        maxAct = 1;
        ans.add(0);
        int lastEnd = end[0];

        for (int i = 1; i < end.length; i++) {
            if (start[i] >= lastEnd) {
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("max activities = " + maxAct);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) +  " ");
        }
    }
}