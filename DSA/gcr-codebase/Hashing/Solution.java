import java.util.*;

public class Solution {
public boolean hasDuplicateToken(String[] tokens) {
    Set<String> seen = new HashSet<>();
    for(String token : tokens){
        if(!seen.add(token))
            return true;
        }
        return false;
    }
}