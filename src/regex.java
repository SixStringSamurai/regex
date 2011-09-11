
import java.util.Map.Entry;
import java.util.regex.*;
import java.util.HashMap;

public class regex {
	public static void main (String[] args) {
		System.out.print("I Rock!\n");
		
		HashMap<String, Integer> timeCode = new HashMap<String, Integer>();
		String sampleInput = "three days 10 hours 2 minutes 51 second " +
				"3 day 10 hour to minutes 51 second ";
		
		Pattern daysPattern = Pattern.compile("([0-9]{1,2})\\sday");
		Pattern hoursPattern = Pattern.compile("[0-9]{1,2}\\shour");
		Pattern minutesPattern = Pattern.compile("[0-9]{1,2}\\sminute");
		Pattern secondsPattern = Pattern.compile("[0-9]{1,2}\\ssecond");
		
		Matcher numDays = daysPattern.matcher(sampleInput);
		Matcher numHours = hoursPattern.matcher(sampleInput);
		Matcher numMinutes = minutesPattern.matcher(sampleInput);
		Matcher numSeconds = secondsPattern.matcher(sampleInput);
		
		
		if (numDays.find()){
			System.out.println("Number of days: "+numDays.group());
			//System.out.println("Number of days: "+numDays.group(1));
			timeCode.put("days", new Integer(Integer.parseInt(numDays.group(1))));
		}
		if (numHours.find()){
			System.out.println("Number of hours: "+numHours.group());
			timeCode.put("hours", Integer.parseInt(numHours.group(1)));
		}
		if (numMinutes.find()){
			System.out.println("Number of hours: "+numMinutes.group());
			timeCode.put("minutes", Integer.parseInt(numMinutes.group(1)));
		}
		if (numSeconds.find()){
			System.out.println("Number of seconds: "+numSeconds.group());
			timeCode.put("seconds", Integer.parseInt(numSeconds.group(1)));
		}
		
		for (Entry<String, Integer> entry : timeCode.entrySet()) {
		    String key = entry.getKey();
		    Object value = entry.getValue();
		    System.out.println(key+" value is "+value);
		}		
		
	}
	

	
	
	
	
}