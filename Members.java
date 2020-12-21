package seventeen;

public class Members {
	String name;
    Group group;

    Members(Group group, String name) {
        this.group = group;
        this.name = name;
    }
    
    public void changeGroup(Group group) {
    	this.group = group;
    }
    
    public Group getGroup() {
    	return group;
    }
}
