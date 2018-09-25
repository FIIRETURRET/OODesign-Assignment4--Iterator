
public class KaibaCards implements Menu{
	static final int MAX_ITEMS = 3;
	int numberOfItems = 0;
	MenuItem[] menuItems;
	
	public KaibaCards() {
		menuItems = new MenuItem[MAX_ITEMS];
		
		addItem("Soul Exchange",
				"Spell", "Target 1 monster your opponent controls; this turn, "
						+ "if you Tribute a monster, you must Tribute that monster "
						+ "as if you controlled it. You cannot conduct your Battle-Phase "
						+ "the turn you activate this card.");
		addItem("Blue Eyes White Dragon",
				"Dragon, level 7", "This Legendary dragon is a powerful engine of destruction."
						+ " Virtually invincible, very few have faced this awesome create "
						+ "and lived to tell the tale.");
		addItem("Burst Stream of Destruction",
				"Spell", "If you control a 'Blue Eyes White Dragon' destroy all "
						+ "monsters your apponenet controls. 'Blue Eyes White Dragons' "
						+ "cannot attack the turn you activate this card.");
	}
	
	public void addItem(String name, String type, String cardText) {
		MenuItem menuItem = new MenuItem(name, type, cardText);
		if (numberOfItems >= MAX_ITEMS) {
			System.err.println("Sorry, menu is full! Can't add item to card list");
		}else {
			menuItems[numberOfItems] = menuItem;
			numberOfItems = numberOfItems + 1;
		}
	}
	
	public MenuItem[] getMenuItems() {
		return menuItems;
	}
	
	public Iterator createIterator() {
		return new KaibaCardsIterator(menuItems);
	}
}
