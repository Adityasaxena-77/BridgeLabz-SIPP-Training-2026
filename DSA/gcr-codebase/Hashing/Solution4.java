import java.util.*;

public class Solution4 {
public int subarraySumEqualsK(int[] revenueChanges,int k){
Map<Integer,Integer> prefixCount=new HashMap<>();
prefixCount.put(0,1);
int runningSum=0;
int answer=0;
for(int change:revenueChanges){
runningSum+=change;
answer+=prefixCount.getOrDefault(runningSum-k,0);
prefixCount.put(runningSum,prefixCount.getOrDefault(runningSum,0)+1);
}
return answer;
}
}