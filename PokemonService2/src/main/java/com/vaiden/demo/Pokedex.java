package com.vaiden.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Pokedex {

	private List<String> items;
	
	public Pokedex() {
		this.items = new ArrayList<>();
		
		
		this.items.add("Gengar");
		this.items.add("JigglyPuff");
		this.items.add("Charizard");
		this.items.add("Pikachu");
		this.items.add("Mewouth");
		this.items.add("Diglet");
		this.items.add("Bedoof");
		this.items.add("Machoke");
		this.items.add("Haunter");
		this.items.add("Muk");
	}
	
	public String getPokemon() {
		Random rand = new Random();
		int randomNumber = rand.nextInt(this.items.size());
		return this.items.get(randomNumber);
	}
}
