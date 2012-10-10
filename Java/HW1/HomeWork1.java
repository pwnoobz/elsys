import java.util.ArrayList;
import java.util.Collections;

public class HomeWork1 {
	public static void main(String[] args) {
		ArrayList<String> propList = new ArrayList<String>();
		
		if(args.length == 0) return;
		
		for(String s: args) {
			String prop = java.lang.System.getProperty(s);
			if(prop==null) continue;
			
			propList.add(prop);
		}
		
		Collections.sort(propList);
		
		if(args[args.length-1] != "down"){
			Collections.reverse(propList);
		}
		
		for(String prop:  propList){
			System.out.println(prop);
		}
	}

}
