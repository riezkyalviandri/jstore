/**
 * Kelas ini berfungsi untuk menambahkan dan mengurangi barang
 * yang ada pada kelas Item.
 *
 * @author (Riezky Alviandri Ramadhan)
 * @version (2019-02-28)
 */
public class DatabaseItem
{
    //Instansi variable
    private String[] listItem;
    private Item item;

    /**
     * Method untuk menambahkan barang ke dalam database
     * 
     * @param item  Barang yang akan masuk ke database
     * @return Status barang yang masuk
     * 
     */
    public boolean addItem(Item item)
    {
        return false;
    }
    
    /**
     * Method untuk menghilangkan barang dari dalam database
     * 
     * @param item  Barang yang akan dihilangkan dari database
     * @return Status barang yang dihapus
     * 
     */
    public boolean removeItem(Item item)
    {
        return false;
    }
    
    /**
     * Method untuk mendapatkan item dari kelas Item
     * 
     * @return Barang yang ada di kelas Supplier
     * 
     */
    public Item getItem()
    {
        return this.item;
    }
    
    /**
     * Method untuk mendapatkan database barang
     * 
     * @return List barang yang ada di database
     * 
     */
    public String[] getItemDatabase()
    {
        return this.listItem;
    }
}
