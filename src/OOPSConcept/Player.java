package OOPSConcept;

import java.util.ArrayList;

public class Player {

	private String name;
	private int money;
	private ArrayList<Pokemon> team=new ArrayList<Pokemon>();
	/**
	 * @param name
	 * @param money
	 * @param team
	 */
	public Player(String name, int money) {
		
		this.name = name;
		this.money = money;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void addPokemon(Pokemon poke){
		this.team.add(poke);
	}
	public void printTeam(){
		for(int i=0;i<team.size();i++)
		{
			System.out.println(team.get(i).getName());
		}
	}
}
