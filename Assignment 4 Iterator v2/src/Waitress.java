
public class Waitress {

	Menu kaibaCardsMenu;
	Menu yugiCardsMenu;
	
	public Waitress(Menu yugiCardsMenu, Menu kaibaCardsMenu) {
		this.kaibaCardsMenu = kaibaCardsMenu;
		this.yugiCardsMenu = yugiCardsMenu;
	}
	
	public void printMenu() {
		Iterator yugiCardsIterator = yugiCardsMenu.createIterator();
		Iterator kaibaCardsIterator = kaibaCardsMenu.createIterator();
		
		System.out.println("Yugimoto cards\n");
		printMenu(yugiCardsIterator);
		System.out.println("\nKaiba cards\n");
		printMenu(kaibaCardsIterator);
	}
	
	private void printMenu(Iterator iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ", ");
			System.out.print(menuItem.getType() + " -- ");
			System.out.println(menuItem.getCardText());
		}
	}
}
