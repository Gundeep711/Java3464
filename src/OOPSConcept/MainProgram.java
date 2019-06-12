package OOPSConcept;

public class MainProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pokemon a=new Pokemon("Pickachu", "electric", 100);
		Pokemon b=new Pokemon("Charizad", "Fire", 500);
		System.out.println(a.getName());//directly accessing the variable if variable is public only
		
		Player p=new Player("Peter", 100);
		p.addPokemon(a);
		p.addPokemon(b);
		p.printTeam();

	}

}
