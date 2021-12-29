package SQLJDBC;

public class POJOClass {
    private String CourseName;
    private String PurchaseDate;
    private int Amount;
    private String Location;

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        this.CourseName = courseName;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.PurchaseDate = purchaseDate;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        this.Amount = amount;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }



}
