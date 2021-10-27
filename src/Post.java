import java.util.ArrayList;

public class Post {	
	
	private String text;
	private ArrayList<Profile> likes;
	private ArrayList<PostPhoto> photos;	
	
	public Post(String text, ArrayList<String> imagePaths) {
		this.text = text;
		this.likes = new ArrayList<Profile>();
		this.photos = new ArrayList<PostPhoto>();
		
		for(var imagePath : imagePaths)
		{
			this.photos.add(new PostPhoto(imagePath));
		}
	}
	
	public void show() {
		System.out.println(text);
		System.out.println("Likes: " + getLikes().size());
		
		if(photos.size() >= 1)
		{
			PostPhoto firstPostPhoto = photos.get(0);
			firstPostPhoto.getPhoto().display();
		}
	}
	
	public void likeOrDeslike(Profile user)
	{
		// Se o usuário já tiver dado like, remova ele (deslike)
		if(getLikes().contains(user))
		{
			getLikes().remove(user);
		} 
		// Se não, então adicione
		else
		{
			getLikes().add(user);
		}
	}

	public ArrayList<Profile> getLikes() {
		return likes;
	}
}
