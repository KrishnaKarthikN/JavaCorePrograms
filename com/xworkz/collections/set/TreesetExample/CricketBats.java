package com.xworkz.collections.set.TreesetExample;

public class CricketBats {

	
	private String name;
	private String willowtype;
	private int price;
	
	public CricketBats(String name, String willowtype, int price) {
		super();
		this.name = name;
		this.willowtype = willowtype;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWillowtype() {
		return willowtype;
	}
	public void setWillowtype(String willowtype) {
		this.willowtype = willowtype;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CricketBats [name=" + name + ", willowtype=" + willowtype + ", price=" + price + "]";
	}
	
	
		
	
}
