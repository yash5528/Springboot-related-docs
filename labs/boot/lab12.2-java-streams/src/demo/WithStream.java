package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class WithStream {

	
	public static void main(String[] args) {
		int sum = 0;
		
        List<Integer> list =Arrays.asList(10,20,15,7);
        
           
     //  sum = list.stream().filter(i -> i> 10).mapToInt(i -> i).sum();
      sum = list.stream().map(x->x*x).filter(i -> i> 10).mapToInt(i -> i).sum();
       list.stream().sorted().forEach(y->System.out.println(y));
     //  sum = list.parallelStream().filter(i -> i> 10).mapToInt(i -> i).sum();
       
    	System.out.println("sum "+sum);
        
	}
}
