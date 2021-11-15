public class MinCostClimbingStairs {

    public static void main(String[] args) {
        int cost[] = {2, 5, 3, 1, 7, 3, 4};
        System.out.println(minCostClimbingStairs(cost));
    }
    
    public static int minCostClimbingStairs(int[] cost) {
        int totalCost1 = 0, totalCost2 = 0;
 
        // traverse all the value in the array
        for (int i = 0; i < cost.length; i++)
        {
            int initialCost = cost[i] + Math.min(totalCost1, totalCost2);

            // update the last two stairs value
            totalCost2 = totalCost1;
            totalCost1 = initialCost;
        }
        return Math.min(totalCost1, totalCost2);
    }
    
}
