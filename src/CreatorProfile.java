import java.util.ArrayList;

public class CreatorProfile extends Profile {	
	private String categoryLabel;
	
	public CreatorProfile(
			String name, 
			String id, 
			String bio, 
			String imagePath, 
			String categoryLabel) {
		super(name, id, bio, imagePath);
		this.categoryLabel = categoryLabel;
	}
	
	public void show()
	{		
		System.out.println(this.name);
		System.out.println("Category: " + this.categoryLabel);
		System.out.println("@" + this.id);
		System.out.println("Bio: " + this.bio);
		
		showConnectionNetwork();		
		showPhoto();		
		showPosts();
		
		System.out.println("\n---\n");
	}
}