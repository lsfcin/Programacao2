import java.awt.EventQueue;
import java.util.ArrayList;

public class Profile {
	protected String name;
	protected String id;
	protected String bio;
	protected Image photo;
	protected ArrayList<Profile> following;
	protected ArrayList<Profile> followedBy;
	protected ArrayList<Post> posts;
	
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
		
		showConnectionNetwork();		
		showPhoto();		
		showPosts();
		
		System.out.println("\n---\n");
	}

	protected void showPosts() {
		if(getPosts().size() > 0)
		{
			System.out.println("" + getPosts().size() + " posts:");
			for(Post post : getPosts())
			{
				post.show();
			}
		}
	}

	protected void showPhoto() {
		if(photo != null) {
			photo.display();			
		}
	}

	protected void showConnectionNetwork() {
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
