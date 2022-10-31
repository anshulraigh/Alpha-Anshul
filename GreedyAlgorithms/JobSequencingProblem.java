import java.util.ArrayList;
import java.util.Collections;

public class JobSequencingProblem {
    /*
     * Given an array of jobs where every job has a deadline and profit if the job is finished 
     * before deadline. it is also given that every job takes a single unit of time, so the 
     * minimum posssible deadline for any job is 1. maximize the total profit if only one job
     *  can be scheduled at a time.
     * 
     * Job A = 4,20
     * Job B = 1,10
     * Job C = 1,40
     * Job D = 1,30
     * 
     * Answer = C,A
     * 
     * case 1 if we do job A time = 1 profit = 20 
     * case 2 if we do job B then A time = 2 profit = 10+20 = 30 
     * case 3 if we do job C then A time = 2 profit = 40+20 = 60 
     * case 3 if we do job D then A time = 2 profit = 30+20 = 50 
     * 
     * Approach - 
     * 1) sort(whatever min Or max you have to find) here we hav eto find max profit
     * 
     */
    static class Job{
        int deadline,profit;
        int id; // 0-A , 1-B , 2-C ......

        public Job(int i,int d,int p){
            id = i;
            deadline = d;
            profit = p;
        }

    }
    public static void main(String[] args) {
        int jobsInfo [][] = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i,jobsInfo[i][0],jobsInfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit);
        // descending order of profit

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("Max Jobs = " + seq.size());
        System.out.println(seq);
    }
}
