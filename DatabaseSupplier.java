/**
 * Kelas ini berfungsi untuk menambahkan dan mgengurangi daftar
 * supplier yang ada pada kelas Supplier.
 *
 * @author (Riezky Alviandri Ramadhan)
 * @version (2019-02-28)
 */
public class DatabaseSupplier
{
    //Instansi variable
    private String[] listSupplier;
    private Supplier supplier;

    /**
     * Method untuk menambahkan supplier ke dalam database
     * 
     * @param item  Supplier yang akan masuk ke database
     * @return Status supplier yang masuk
     * 
     */
    public boolean addSupplier(Supplier supplier)
    {
        return false;
    }

    /**
     * Method untuk menghilangkan supplier dari dalam database
     * 
     * @param item  Supplier yang akan dihilangkan dari database
     * @return Status Supplier yang dihapus
     * 
     */
    public boolean removeSupplier(Supplier supplier)
    {
        return false;
    }
    
    /**
     * Method untuk mendapatkan supplier dari kelas Supplier
     * 
     * @return Supplier yang ada di kelas Supplier
     * 
     */
    public Supplier getSupplier()
    {
        return this.supplier;
    }
    
    /**
     * Method untuk mendapatkan database supplier
     * 
     * @return List Supplier yang ada di database
     * 
     */
    public String[] getListSupplier()
    {
        return this.listSupplier;
    }
}
