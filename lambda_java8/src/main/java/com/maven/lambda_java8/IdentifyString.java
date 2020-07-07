package com.maven.lambda_java8;
import java.util.*;
import java.util.stream.Collectors;  
interface Length{  
    boolean calculate_len(String str);  
}  
public class IdentifyString {
	public List<String> filter(List<String> list){
		List<String> filtered_list = list.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList()); 
        List<String> result = new ArrayList<>();
        Length len =(String s)->{if(s.length() == 3) return true;return false;};  
        for(String s : filtered_list){
            if(len.calculate_len(s)) result.add(s); 
        }
        return(result);
	}
}
