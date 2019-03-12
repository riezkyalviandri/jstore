/**
 * Kelas ini berfungsi untuk menyimpan data invoice transaksi
 * yang terjadi, termasuk barang yang dibeli, tanggal pembelian,
 * dan total harga total.
 *
 * @author (Riezky Alviandri Ramadhan)
 * @version (2019-02-28)
 */
public class Invoice
{
    //Instansi variable
    private int id;
    private Item item;
    private String date;
    private int totalPrice;

    /**
     * Constructor untuk kelas Invoice
     * 
     * @param id            Id invoice
     * @param item          barang dari kelas Item
     * @param date          Tanggal invoice dibuat
     * @param totalPriece   Total harga di invoice
     * 
     */
    public Invoice(int id, Item item, String date, int totalPrice)
    {
        this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
    }
    
    /**
     * Method untuk mendapatkan id invoice
     * 
     * @return Id dari invoice
     * 
     */
    public int getId()
    {
        return this.id;
    }
   
    /**
     * Method untuk mendapatkan barang di invoice
     * 
     * @return Barang di invoice
     * 
     */
    public Item getItem()
    {
        return this.item;
    }
    
    /**
     * Method untuk mendapatkan tanggal dibuatnya invoice
     * 
     * @return Tanggal pembuatan invoice
     * 
     */
    public String getDate()
    {
        return this.date;
    }
    
    /**
     * Method untuk mendapatkan total harga di invoice
     * 
     * @return total harga pada invoice
     * 
     */
    public int getTotalPrice()
    {
        return this.totalPrice;
    }
    
    /**
     * Method untuk menset id invoice
     * 
     * @param id    Id invoice
     * 
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Method untuk menset barang pada invoice
     * 
     * @param item    Barang di invoice
     * 
     */
    public void setItem(int Item)
    {
        this.item=item;
    }
    
    /**
     * Method untuk menset tanggal pembuatan invoice
     * 
     * @param date    Tanggal dibuatnya invoice
     * 
     */
    public void setDate(String date)
    {
        this.date=date;
    }
    
    /**
     * Method untuk menset total harga di invoice
     * 
     * @param totalPrice    Total harga di invoice
     * 
     */
    public void setTotalPrice(int totalPrice)
    {
        this.totalPrice=totalPrice;
    }
    
    /**
     * Method untuk memprint nama item
     */
    public void printData()
    {
        
    }
}
