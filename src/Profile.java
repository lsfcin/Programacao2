import java.awt.EventQueue;
import java.util.ArrayList;

public class Profile {
	private String name;
	private String id;
	private String bio;
	private Image photo;
	private ArrayList<Profile> following;
	private ArrayList<Profile> followedBy;
	private ArrayList<Post> posts;
	
	// Imagens, marcações para cada imagem e texto
	
	public Profile(String name, String id, String bio, String imagePath) {
		this.name = name;
		this.id = id;
		this.bio = bio;
		this.posts = new ArrayList<Post>();
		this.following = new ArrayList<Profile>();
		this.followedBy = new ArrayList<Profile>();
		this.photo = new Image(imagePath);
	}
	
	public Profile(String name, String id, String bio) {
		this(name, id, bio, "D:\\Downloads\\images\\user.jpg");
	}

	public void show() {
		System.out.println(this.name);
		System.out.println("@" + this.id);
		System.out.println("Bio: " + this.bio);
		
		if(following.size() > 0)
		{
			System.out.println("\nSeguindo: ");
			for(Profile user : following) {
				System.out.println("." + user.name);
			}
		}
		
		if(followedBy.size() > 0)
		{
			System.out.println("\nSeguido por: ");
			for(Profile follower : followedBy) {
				System.out.println("." + follower.name);
			}
		}
		
		if(photo != null) {
			photo.display();			
		}
		
		if(getPosts().size() > 0)
		{
			System.out.println("" + getPosts().size() + " posts:");
			for(Post post : getPosts())
			{
				post.show();
			}
		}
		
		System.out.println("\n---\n");
	}
	
	public void follow(Profile user) {
		this.following.add(user);
		user.followedBy.add(this);
	}
	
	public void createPost(String text, ArrayList<String> imagePaths) {
		Post post = new Post(text, imagePaths);
		getPosts().add(post);
	}
	
	public void createPost(String text, String imagePath) {
		ArrayList<String> imagePaths = new ArrayList<String>();
		imagePaths.add(imagePath);
		createPost(text, imagePaths);
	}

	public void likeOrDeslikePost(Profile user, int postID) {
		user.getPosts().get(postID).likeOrDeslike(this);
	}

	public ArrayList<Post> getPosts() {
		return posts;
	}
}
