package seventeen;

import java.util.Arrays;
import java.util.List;

public class Group {
	String name;
	List <Song> songs;
	EntertainmentCompany company;
	List<Members> members;
	
	Group() {
		members = Arrays.asList(
				new Members(this, "Mark"),
				new Members(this, "San"));
				
	}

}
