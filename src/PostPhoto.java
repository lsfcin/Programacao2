import java.util.ArrayList;

public class PostPhoto {
	
	private Image photo;
	private String place;
	private ArrayList<Tag> tags;	
	
	public PostPhoto(String imagePath) {
		this.photo = new Image(imagePath);
		this.place = "";
		this.tags = new ArrayList<Tag>();
	}
	
	public Image getPhoto()
	{
		return this.photo;
	}	
}
