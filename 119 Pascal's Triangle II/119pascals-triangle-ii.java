import java.util.*;

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        
        // Start with the first row
        row.add(1);
        
        // Build rows until we reach rowIndex
        for (int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);  // first element
            
            // middle elements
            for (int j = 1; j < row.size(); j++) {
                int val = row.get(j - 1) + row.get(j);
                newRow.add(val);
            }
            
            newRow.add(1);  // last element
            row = newRow;   // move to next row
        }
        
        return row;
    }
}
