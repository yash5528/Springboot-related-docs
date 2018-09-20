package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WithoutStreams {

	
	public static void main(String[] args) {
		int sum = 0;
		
		List<Integer> list =Arrays.asList(10,20,15,7);
        
        Iterator<Integer> it = list.iterator();
            	
    	while (it.hasNext()) {
    		int num = it.next();
    		if (num > 10) {
    			sum += num;
    		}
    	}
    	
    	System.out.println("sum "+sum);
        
	}
}
