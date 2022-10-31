import java.util.Arrays;
import java.util.Collections;

public class Chocolate {
    /*
     * we are given a bar of chocolate composed of M*N square pieces. One should
     * break the
     * chocolate into single square . each break of a part of the chocolate is
     * charged a cost
     * expressed by a positive integer . This cost does not depend on the size of
     * the part that
     * is being broken but only depends on the line the break goes along. let us
     * denote the
     * cost of breaking along consecutive vertical lines with a1,x2....xm-1 and
     * along horizontal
     * lines with y1,y2...yn-1.
     * Compute the minimal cost of breaking the whole chocolate into single squares.
     * 
     */
    public static void main(String[] args) {
        // int n = 4, m = 6;
        Integer costVer[] = { 2, 1, 3, 1, 4 };
        Integer costHor[] = { 4, 1, 2 };

        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // pointers for costVer/costHor
        int hp = 1, vp = 1; // horizontal parts/vertical parts
        int cost = 0; // minCost

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] <= costHor[h]) {
                cost += (costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost += (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length) {
            cost += (costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length) {
            cost += (costVer[v] * hp);
            vp++;
            v++;
        }
        System.out.println(cost);
    }
}
