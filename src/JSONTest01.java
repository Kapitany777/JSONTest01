import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JSONTest01 {

	private static void example1()
	{
		// Create and display a simple JSONObject 
		JSONObject obj = new JSONObject();
		
		obj.put("firstName", "John");
		obj.put("lastName", "Smith");
		obj.put("year", 1980);
		obj.put("isVip", true);
		
		System.out.println(obj.toString());
	}
	
	private static void example2()
	{
		// Create a JSONObject from a HashMap 
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("firstName", "John");
		map.put("lastName", "Smith");
		
		JSONObject obj = new JSONObject(map);
		
		String firstName = obj.getString("firstName");
		System.out.println("firstName = " + firstName);
		
		String lastName = obj.getString("lastName");
		System.out.println("lastName = " + lastName);
	}
	
	private static void example3()
	{
		// Read the properties of a JSONObject
		JSONObject obj = new JSONObject();
		
		obj.put("firstName", "John");
		obj.put("lastName", "Smith");
		obj.put("year", 1980);
		obj.put("isVip", true);
		
		try
		{
			String firstName = obj.getString("firstName");
			System.out.println("firstName = " + firstName);
			
			String lastName = obj.getString("lastName");
			System.out.println("lastName = " + lastName);
			
			int year = obj.getInt("year");
			System.out.println("year = " + year);
			
			boolean isVip = obj.getBoolean("isVip");
			System.out.println("isVip = " + isVip);
			
			String bad = obj.getString("bad");
			System.out.println("bad = " + bad);
		}
		catch (JSONException ex)
		{
			System.out.println(ex.toString());
			// System.out.println(ex.getMessage());
		}
	}
	
	private static void example4()
	{
		// Create a JSONObject from a String
		String jsonText = "{\"firstName\":\"John\",\"lastName\":\"Smith\",\"year\":1980,\"isVip\":true}";
		
		JSONObject obj = new JSONObject(jsonText);
		
		String firstName = obj.getString("firstName");
		System.out.println("firstName = " + firstName);
		
		String lastName = obj.getString("lastName");
		System.out.println("lastName = " + lastName);
	}
	
	private static void example5()
	{
		// Create a JSONArray from a string and iterate through it
		String jsonText = "[{\"firstName\":\"John\",\"lastName\":\"Smith\"},{\"firstName\":\"Gordon\",\"lastName\":\"Freeman\"},{\"firstName\":\"Lawrence\",\"lastName\":\"Barnes\"}]";
		
		JSONArray arr = new JSONArray(jsonText);
		
		for (int i = 0; i < arr.length(); i++)
		{
			JSONObject obj = arr.getJSONObject(i);
			
			String firstName = obj.getString("firstName");
			System.out.println("firstName = " + firstName);
			
			String lastName = obj.getString("lastName");
			System.out.println("lastName = " + lastName);
		}
	}
	
	private static void example6()
	{
		// Create a Person object from JSON data
		JSONObject obj = new JSONObject();
		
		obj.put("firstName", "John");
		obj.put("lastName", "Smith");
		
		Person person = new Person(obj.getString("firstName"), obj.getString("lastName"));
		System.out.println(person);
	}
	
	public static void main(String[] args)
	{
		// I have tested Java's JSON classes
		System.out.println("Example 1");
		example1();
		System.out.println();
		
		System.out.println("Example 2");
		example2();
		System.out.println();
		
		System.out.println("Example 3");
		example3();
		System.out.println();
		
		System.out.println("Example 4");
		example4();
		System.out.println();
		
		System.out.println("Example 5");
		example5();
		System.out.println();
		
		System.out.println("Example 6");
		example6();
		System.out.println();
	}
}
