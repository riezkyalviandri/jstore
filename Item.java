/**
 * Kelas ini berfungsi untuk menyimpan data barang apa saja 
 * yang sedang tersedia beserta dengan harganya.
 *
 * @author (Riezky Alviandri Ramadhan)
 * @version (2019-02-28)
 */
public class Item
{
    //Instansi variable
    private int id;
    private String name;
    private int stock;
    private int price;
    private String category;
    private Supplier supplier;

    
    /**
     * Constructor untuk kelas Item
     * 
     * @param id        Id barang
     * @param name      Nama barang
     * @param stock     Stok barang yang tersedia
     * @param price     Harga barang
     * @param category  Kategori barang
     * @param supplier  Supplier barang
     * 
     */
    public Item(int id, String name, int stock,int price, String category, Supplier supplier)
    {
        this.id=id;
        this.name=name;
        this.stock=stock;
        this.price=price;
        this.category=category;
        this.supplier=supplier;
    }
    
    /**
     * Method untuk mendapatkan id barang
     * 
     * @return Id dari barang
     * 
     */
    public int getId()
    {
        return id;
    }
    
    /**
     * Method untuk mendapatkan nama barang
     * 
     * @return Nama dari barang
     * 
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Method untuk mendapatkan stok barang
     * 
     * @return stok dari barang
     * 
     */
    public int getStock()
    {
        return stock;
    }
    
    /**
     * Method untuk mendapatkan harga barang
     * 
     * @return Harga dari barang
     * 
     */
    public int getPrice()
    {
        return price;
    }
    
    /**
     * Method untuk mendapatkan kategori barang
     * 
     * @return Kategori dari barang
     * 
     */
    public String getCategory()
    {
        return category;
    }
    
    /**
     * Method untuk mendapatkan supplier barang
     * 
     * @return Supplier dari barang
     * 
     */
    public Supplier getSupplier()
    {
        return supplier;
    }
    
    /**
     * Method untuk menset id barang
     * 
     * @param id    Id barang
     * 
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Method untuk menset nama barang
     * 
     * @param name    Nama barang
     * 
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * Method untuk menset stok barang
     * 
     * @param stock    stok barang
     * 
     */
    public void setStock(int stock)
    {
        this.stock=stock;
    }
    
    /**
     * Method untuk menset harga barang
     * 
     * @param price    Harga barang
     * 
     */
    public void setPrice(int price)
    {
        this.price=price;
    }
    
    /**
     * Method untuk menset kategori barang
     * 
     * @param category    Kategori barang
     * 
     */
    public void setCategory(String category)
    {
        this.category=category;
    }
    
    /**
     * Method untuk menset supplier barang
     * 
     * @param supplier    Supplier barang
     * 
     */
    public void setSupplier(Supplier supplier)
    {
        this.supplier=supplier;
    }
    
    /**
     * Method untuk memprint nama item
     */
    public void printData()
    {
        
    }
}
