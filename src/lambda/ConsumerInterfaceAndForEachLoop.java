package lambda;

import java.util.Arrays;
import java.util.List;

public class ConsumerInterfaceAndForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> obj = Arrays.asList(1,2,3,4);
		//Traditional for loop
		for(int i=0; i<obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}
		//Enhanced For Loop to print values
		for(int i : obj)
		{
			System.out.println(i);
		}
		//ForEach Loop (supported in java 1.8)
		//For each method accepts the value of consumer Interface, with in which accept method should be implemented
		obj.forEach(i -> System.out.println(i));
	}
}
