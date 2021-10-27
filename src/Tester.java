import java.awt.EventQueue;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tester {
	
	public static Post findBestPost(ArrayList<Profile> profiles)
	{
		Post bestPost = null;
		
		int maxLikes = 0;
		for (Profile profile : profiles) 
		{			
			for(Post post : profile.getPosts()) 
			{				
				if(post.getLikes().size() > maxLikes)
				{
					bestPost = post;
					maxLikes = bestPost.getLikes().size();
				}
			}
		}		
		
		return bestPost;
	}
	
	public static void main(String[] args) {
		ArrayList<Profile> profiles = new ArrayList<Profile>();	
		
		// Criação dos perfis
		profiles.add(new Profile("Lucas Silva Figueiredo", "lsfcin",
				"Professor de Engenharia da Computação na UABJ - UFRPE.",
				"D:\\Downloads\\images\\FOTO 3X4.jpg"));

		profiles.add(new Profile("Lionel Messi", "leomessi",
				"Bienvenidos a la cuenta oficial de Instagram de "
				+ "Leo Messi / Welcome to the official Leo Messi Instagram "
				+ "account",
				"D:\\Downloads\\images\\Messi.jpg"));		

		profiles.add(new Profile("Fausto Silva","ofausto",
				"Perfil oficial do Faustão",
				"D:\\Downloads\\images\\Fausto Silva.jpg"));

		profiles.add(new Profile("Ednaldo Pereira","oficialednaldopereira",
				"Este e o perfil oficial de Ednaldo Pereira. Sigam",
				"D:\\Downloads\\images\\Ednaldo Pereira.png"));
		
		profiles.add(new Profile("Rafa Moreira","ganggang777",
				"Este é o perfil de Rafa Moreira."));
		
		// Seguidores e seguidos
		var lucas = profiles.get(0);
		var messi = profiles.get(1);
		var fausto = profiles.get(2);
		var ednaldo = profiles.get(3);
		
		messi.follow(ednaldo); // Messi segue Ednaldo Pereira
		lucas.follow(messi); // Lucas segue Messi
		messi.follow(fausto); // Messi segue Faustão
		
		// Post de Ednaldo Pereira
		ednaldo.createPost(
				"Ednaldo Pereira jeito fogo por @matheus_fontesz valeu", 
				"D:\\Downloads\\images\\ednaldoPost.png");		
		messi.likeOrDeslikePost(ednaldo, 0);
		messi.likeOrDeslikePost(ednaldo, 0);
		lucas.likeOrDeslikePost(ednaldo, 0);
		fausto.likeOrDeslikePost(ednaldo, 0);
		
		// Post de Messi
		messi.createPost(
				"Dia tenso de jogo", 
				"D:\\Downloads\\images\\Messi.jpg");
		lucas.likeOrDeslikePost(messi, 0);
		fausto.likeOrDeslikePost(messi, 0);
		ednaldo.likeOrDeslikePost(messi, 0);
		
		Post bestPost = findBestPost(profiles);
		bestPost.show();
		
		// Impressão no console
		/*for(Profile profile : profiles)	
		{
			profile.show();
		}*/
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*Dog cachorro1 = new Dog();
		
		cachorro1.eat(0.5f);
		System.out.println("Após comer o peso ficou: " + cachorro1.getWeight() + "kg");
		
		cachorro1.run(15, 2);		
		System.out.println("Após correr o peso ficou: " + cachorro1.getWeight() + "kg");
		
		String brinquedo1 = cachorro1.catchToy();
		System.out.println("O primeiro brinquedo pego foi: " + brinquedo1);
		
		String brinquedo2 = cachorro1.catchToy();
		System.out.println("O segundo brinquedo pego foi: " + brinquedo2);
		
		Dog cachorro2 = new Dog(3, 5.0f);
		
		Scanner scanner = new Scanner(System.in);
		scanner.nextInt();*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*String downloadsPath = "D:/Downloads/";
		String imagePath = downloadsPath + "cachorro-card-1.png";
        Image image = new Image(imagePath);
		EventQueue.invokeLater(() -> {
			image.setVisible(true);
        });
		
		int[] list = new int[10];
		
		Person head = new Person("Ana", 22);
		head.next = new Person("Maria", 21);
		head.next.next = new Person("Paulo", 18);
		head.next.next.next = new Person("Bianca", 37);

		Person personI = head;
		while(personI != null)
		{
			System.out.println("Pessoa: " + personI.name);
			personI = personI.next;
		}






		DrawRainbow panel = new DrawRainbow(); 
		JFrame application = new JFrame();

		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(400, 250);
		application.setVisible(true);*/

	//}
//}