import java.util.ArrayList;

public class YugiCards implements Menu{
	ArrayList<MenuItem> menuItems;
	
	public YugiCards() {
		menuItems = new ArrayList<MenuItem>();
		
		addItem("Dark Magician",
				"Spellcaster:", "The ultimate wizard in terms of attack and defense");
		addItem("Mirror Force",
				"Trap", "When an opponent's monster declares and attack: Destroy all"
						+ " Attack Position monsters your opponenet controls");
		addItem("Dark Magician Girl",
				"Spellcaster/Effect", "This card gains 300 ATK for every 'Dark Magicaian'"
						+ " or 'Magician of Black Chaos' in either player's Graveyard");
	}

	public void addItem(String name, String type, String cardText) {
		MenuItem menuItem = new MenuItem(name, type, cardText);
		menuItems.add(menuItem);
	}
	
	public ArrayList<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new YugiCardsIterator(menuItems);
	}
	
	public String toString() {
		return "Yugi's cards";
	}
}
