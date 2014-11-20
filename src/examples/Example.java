package examples;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
public class Example 

{
public static void main(String args[])
{
	HashMap<String, String> stu= new HashMap<String, String>();
	stu.put("cat", "meow");
	stu.put("dog", "bow");
	//we define a set of String type to collect all keys
		Set <String >key = stu.keySet();
		//reason for using set here is that the keys are always unique
		//we iterate it using enhanced for loop
		for(String t : key)
		{
			System.out.println("Key is "+t);
			//if we use stu.get(t); will print values.reason is key in valus is printed
			//important one here is if you give key the values that key points will be given out
			//if you give values you will get the key. one key can point many values
			System.out.println("valus is " +stu.get(t));//we give keys as input and get values printed
		}
		Collection<String> Values = stu.values();
		//reason for using collection is that duplication of values is allowed
		for(String v: Values)//
		{
			System.out.println("Values seperately.. "+v);
			
		}
}
}
