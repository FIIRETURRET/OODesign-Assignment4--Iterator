import java.util.*;

public class Test {

	public static void main(String args[]) {
        YugiCards yugiCards = new YugiCards();
        KaibaCards kaibaCards = new KaibaCards();
		
        ArrayList<MenuItem> yugiItems = yugiCards.getMenuItems();
		MenuItem[] kaibaItems = kaibaCards.getMenuItems();
		
		// Hiding implementation
		System.out.println("Yugi's Cards\n");
		for (MenuItem menuItem : yugiItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getType());
			System.out.println("\t" + menuItem.getCardText());
		}
		System.out.println("\n\nKaiba's Cards\n");
		for (MenuItem menuItem : kaibaItems) {
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getType());
			System.out.println("\t" + menuItem.getCardText());
		}
	}
}
