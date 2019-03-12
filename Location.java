/**
 * Kelas ini berfungsi untuk menyimpan data lokasi kota, provinsi,
 * dan deskripsi untuk setiap lokasinya.
 *
 * @author (Riezky Alviandri Ramadhan)
 * @version (2019-02-28)
 */
public class Location
{
    //Instansi variable 
    private String province;
    private String description;
    private String city;

    /**
     * Constructor untuk kelas Location
     * 
     * @param city          Kota
     * @param province      Provinsi
     * @param description   Deskripsi
     * 
     */
    public Location(String city, String province, String description)
    {
        this.city=city;
        this.province=province;
        this.description=description;
    }

    /**
     * Method untuk mendapatkan nama provinsi
     * 
     * @return Nama provinsi
     * 
     */
    public String getProvince()
    {
        return this.province;
    }
    
    /**
     * Method untuk mendapatkan nama kota
     * 
     * @return Nama kota
     * 
     */
    public String getCity()
    {
        return this.city;
    }
    
    /**
     * Method untuk mendapatkan deskripsi lokasi
     * 
     * @return Deskripsi lokasi
     * 
     */
    public String getDescription()
    {
        return this.description;
    }
    
    /**
     * Method untuk menset nama provinsi
     * 
     * @param province    Nama provinsi
     * 
     */
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    /**
     * Method untuk menset nama kota
     * 
     * @param city    Nama kota
     * 
     */
    public void setCity(String city)
    {
        this.city=city;
    }
    
    /**
     * Method untuk menset deskripsi lokasi
     * 
     * @param description    Deskripsi lokasi
     * 
     */
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    /**
     * Method untuk memprint nama item
     */
    public void printData()
    {
        
    }
}
