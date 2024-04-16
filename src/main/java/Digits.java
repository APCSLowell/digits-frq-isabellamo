import java.util.ArrayList;

public class Digits{

	private ArrayList<Integer> digitList;

	public Digits(int num) { /* to be implemented in part (a) */ 
		digitList = new ArrayList<>();
        
        	// Special case for num = 0
        	if (num == 0) {
            		digitList.add(0);
            		return;
        	}
        
        	// Extract and add each digit from num to digitList
        	while (num > 0) {
            		digitList.add(0, num % 10); // Add digit to the front of the list
            		num /= 10; // Remove the last digit
        	}
	}

	public boolean isStrictlyIncreasing() { /* to be implemented in part (b) */
		for (int i = 1; i < digitList.size(); i++) {
            		if (digitList.get(i) <= digitList.get(i - 1)) {
                		return false;
            		}
        	}
        	return true;		
	}
	
	public String toString() {
		return digitList.toString();
	}

	public int countElectronicsByMaker(String maker) {
        	int count = 0;
        	
		for (Gizmo gizmo : purchases) {
            		if (gizmo.isElectronic() && gizmo.getMaker().equals(maker)) {
                		count++;
            		}
        	}
        	return count;
    	}

    	public boolean hasAdjacentEqualPair() {
        	for (int i = 0; i < purchases.size() - 1; i++) {
            		if (purchases.get(i).equals(purchases.get(i + 1))) {
                		return true;
            		}
        	}
        	return false;
    	}
}
