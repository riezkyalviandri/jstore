/**
 * Kelas ini berfungsi untuk menyimpan data supplier seperti nama,
 * email, nomor telfon, dan lokasinya.
 *
 * @author (Riezky Alviandri Ramadhan)
 * @version (2019-02-28)
 */
public class Supplier
{
    //Instansi variable
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    /**
     * Constructor untuk kelas Supplier
     * 
     * @param id            Id suppllier
     * @param name          Nama supplier
     * @param email         Email supplier
     * @param phoneNumber   Nomor telfon supplier
     * @param location      Lokasi supplier
     * 
     */
    public Supplier(int id, String name, String email, String phoneNumber, Location location)
    {
        this.id=id;
        this.name=name;
        this.email=email;
        this.phoneNumber=phoneNumber;
        this.location=location;
    }
    
    /**
     * Method untuk mendapatkan id supplier
     * 
     * @return Id dari supplier
     * 
     */
    public int getId()
    {
        return this.id;
    }
    
    /**
     * Method untuk mendapatkan nama supplier
     * 
     * @return Nama dari supplier
     * 
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Method untuk mendapatkan email supplier
     * 
     * @return Email dari supplier
     * 
     */
    public String getEmail()
    {
        return this.email;
    }
    
    /**
     * Method untuk mendapatkan nomor telfon supplier
     * 
     * @return Nomor telfon dari supplier
     * 
     */
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }
   
    /**
     * Method untuk menset id supplier
     * 
     * @param id    Id supplier
     * 
     */
    public void setId(int id)
    {
        this.id=id;
    }
    
    /**
     * Method untuk menset nama supplier
     * 
     * @param name    Nama supplier
     * 
     */
    public void setName(String name)
    {
        this.name=name;
    }
    
    /**
     * Method untuk menset email supplier
     * 
     * @param email    Email supplier
     * 
     */
    public void setEmail(String email)
    {
        this.email=email;
    }
    
    /**
     * Method untuk menset nomor telfon supplier
     * 
     * @param phoneNumber    Nomor telfon supplier
     * 
     */
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber=phoneNumber;
    }
    
    /**
     * Method untuk memprint nama item
     */
    public void printData()
    {
        
    }
}
