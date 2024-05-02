import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
public class ActivityScheduling 
{

	public static void main(String[] args) 
	{
		ArrayList<Activity> activity_list = new ArrayList<>();
		activity_list.add(new Activity(1,5,9) );
		activity_list.add( new Activity(2,1,2));
		activity_list.add(new Activity(3,3,4) );
		activity_list.add(new Activity(4,0,6) );
		activity_list.add(new Activity(5,5,7) );
		activity_list.add(new Activity(6,8,9) );
		
		selectActivities(activity_list);
		

	}
	
	public static void selectActivities(ArrayList<Activity> activities)
	{
		Collections.sort(activities);

        System.out.println("Selected activities are:");

        // The first activity always gets selected
        int i = 0;
        System.out.println(activities.get(i));

        // Consider rest of the activities
        for (int j = 1; j < activities.size(); j++) 
        {
            // If this activity has start time greater than or equal to the finish time of the previously selected activity, then select it
            if (activities.get(j).start >= activities.get(i).finish) 
            {
                System.out.println(activities.get(j));
                i = j;
            }
        }
		
	}
	

}

class Activity implements Comparable<Activity>
{
	int index, start, finish;
	Activity(int index, int start, int finish)
	{
		this.index =index;
		this.start =start;
		this.finish =finish;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(finish, index, start);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Activity other = (Activity) obj;
		return finish == other.finish && index == other.index && start == other.start;
	}

	@Override
	public int compareTo(Activity that) 
	{
		return this.finish - that.finish;
	}
	@Override
	public String toString()
	{
		return this.index+":("+this.start+", "+this.finish+")";
	}
	
	
	
}



	

