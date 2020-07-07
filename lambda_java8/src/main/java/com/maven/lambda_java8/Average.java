package com.maven.lambda_java8;
import java.util.*;
interface Avg{  
    double calculate_avg(List<Integer> list);  
}  
public class Average {
	public double avgList(List<Integer> list) {
		Avg avg=(List<Integer> l)->{int siz = l.size();int tot = 0;for(int i : l) tot+=i;return(tot*1.0/siz);}; 
		return(avg.calculate_avg(list));
	} 
}
