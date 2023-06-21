package pizza_project;
public class Pizza{
	//Total price of the pizza
	private int price;
	// This will tell Whether pizza is veg or Non veg
	private Boolean isVeg;
	// This is going to hold the bill
	private String bill;
	
	//////////////////////////
	private int basePrice;
	private int extraCheesePrice;
	private int extraToppingsPrice;
	private int paperBagPrice;
	
	///////////////////////////
	
	
	///////////////////////
	private Boolean isExtraCheeseAdded=false;
	private Boolean isExtraToppingsAdded=false;
	private Boolean isTakeawayAdded=false;
	private Boolean isBillGenerated=false;
	
	public Pizza(Boolean isVeg) {
		this.isVeg=isVeg;
		if(this.isVeg==true) {
			this.basePrice=300;
			this.extraToppingsPrice=70;
		}
		else
		{
			this.basePrice=400;
			this.extraToppingsPrice=120;
		}
		this.extraCheesePrice=80;
		this.paperBagPrice=20;
		this.price=this.basePrice;
		
	}
	public int getPrice() {
		return this.price;
	}
	public void addExtraCheese() {
		if(this.isExtraCheeseAdded==false ) {
			this.price = this.price + this.extraCheesePrice;
			this.isExtraCheeseAdded=true;
		}
		 
	}
	public void addExtraToppings() {
		if(this.isExtraToppingsAdded==false) {
			this.price=this.price+this.extraToppingsPrice;
			this.isExtraToppingsAdded=true;
		}
		
	}
	public void addTakeaway() {
		if(this.isTakeawayAdded==false) {
			this.price=this.price+this.paperBagPrice;
			isTakeawayAdded=true; 
		}
	}
	public String getBill() {
		if(this.isBillGenerated==false) {
			this.bill="Base price of the pizza: " + this.basePrice + "\n";
			if(this.isExtraCheeseAdded==true) {
				this.bill +="Extra Cheese Added: " + this.extraCheesePrice + "\n";
			}
			if(this.isExtraToppingsAdded==true) {
				this.bill += "Extra Topping Added: " + this.extraToppingsPrice + "\n";
			}
			if(this.isTakeawayAdded==true) {
				this.bill += "Paperbag Added: " + this.paperBagPrice + "\n"; 
			}
			this.bill += "Total Price: " + this.price;
			this.isBillGenerated=true;
			
		}
		return this.bill;
	}
}

