package kr.co.lang.ex1;

public class Phone {
	
	private int price;
	private int size;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	
	@Override
	public boolean equals(Object obj) {
		Phone ph = (Phone)obj;
		boolean isSamePrice = this.price == ph.getPrice() ? true : false;
		boolean isSameSize = this.size == ph.getSize() ? true : false;
		
		return isSamePrice && isSameSize;
		//return super.equals(obj);
	}
	
}
