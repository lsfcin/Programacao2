public class Dog {
	private int age; // Idade
	private float weight; // Peso em quilos
	private float height; // Altura
	private String name; // Nome
	private String race; // Raça
	private String personality; // Personalidade
	private Color furColor; // Cor do Pelo
	private Image[] photos; // Foto	
	private String[] toys = new String[]{"OSSO", "URSO", "CHINELO", "BOLA", "NENHUM"}; // Brinquedos
	
	public Dog(int age, float weight)
	{
		this.age = age;
		this.weight = weight;
	}
	
	public Dog()
	{
		this.age = 3;
		this.weight = 5.0f;
	}
	
	public void eat(float rationWeight) { // Comer, rationWeight -> peso da ração
		this.weight += rationWeight;
	}
	
	public void run(int minutes, int intensity) { // Correr
		// para weight 1.0f = 1000 gramas
		// intensity == 1 -> a cada 1 min o cachorro perde 10g = 0.01f
		// intensity == 2 -> a cada 1 min o cachorro perde 20g = 0.02f
		// intensity == 3 -> a cada 1 min o cachorro perde 30g = 0.03f
		this.weight -= minutes * ((float)intensity / 100.0f); // cast de intensity para o tipo float
	}
	
	public String catchToy() {
		int index = (int)(Math.random() * toys.length); // valor entre 0 e 4
		return toys[index];
	}
	
	public void setWeight(float weight) {
		if(weight > 0)
		{
			this.weight = weight;
		}			
	}

	public float getWeight() {		
		return weight;
	}
	
	public String[] getToys()
	{
		return toys;
	}
}

