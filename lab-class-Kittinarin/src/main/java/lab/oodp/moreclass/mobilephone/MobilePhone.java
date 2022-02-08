package lab.oodp.moreclass.mobilephone;

public class MobilePhone {

	private String brand;
	private String model;
	private double price;
		
    public MobilePhone(String brand, String model, double price) {
    	this.brand = brand;
    	this.model = model;
    	this.price = price;
    }
    public double getPrice() {
    	return this.price ;
    }
    public void setPrice(double price) {
    	price = this.price;
    }
    
    
    public String getModel() {
    	return this.model;
    }
    public void setModel(String model) {
    	this.model = model;
    }
    
    public String getBrand() {
    	return this.brand;
    }
    public void setBrand(String brand) {
    	this.brand = brand;
    }
    

    public boolean isCheaperThan(MobilePhone other) {
    	if (this.price < other.getPrice()) {
    		return true;
    	}
    	return false;
    }

    @Override
    public String toString() {
    	//TODO: complete this method to print out mobile phone info.
        return brand+" "+model+" which cost $"+price;
    }

    @Override
    public boolean equals(Object obj) {
    	if (obj instanceof MobilePhone) {
    		MobilePhone ojectMP = (MobilePhone) obj;
    	    return ojectMP.getBrand().equals(this.brand) &&
    	    		ojectMP.getModel().equals(this.model) && 
    	    		ojectMP.getPrice() == (this.price);
    	    }
        return false;
    }
}


