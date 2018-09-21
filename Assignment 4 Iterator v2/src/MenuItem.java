
public class MenuItem {
	String name;
	String type;
	String cardText;
 
	public MenuItem(String name, 
	                String type, 
	                String cardText) 
	{
		this.name = name;
		this.type = type;
		this.cardText = cardText;
	}
  
	public String getName() {
		return name;
	}
  
	public String getType() {
		return type;
	}
  
	public String getCardText() {
		return cardText;
	}
  
	public String toString() {
		return (name + ", " + type + "\n   " + cardText);
	}
}