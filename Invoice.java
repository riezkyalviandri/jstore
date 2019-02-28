public class Invoice
{
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    public Invoice(int id, Item item, String date, int totalPrice)
    {
        //constructor
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
    }
    
    public int getId()
    {
        return this.id;
    }
   
    public Item getItem()
    {
        return this.item;
    }
    
    public String getDate()
    {
        return this.date;
    }
    
    public int getTotalPrice()
    {
        return this.totalPrice;
    }
    
    public void setId(int id)
    {
        this.id=id;
    }
    
    public void setItem(int Item)
    {
        this.item=item;
    }
    
    public void setDate(String date)
    {
        this.date=date;
    }
    
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    public void printData()
    {
        
    }
}
