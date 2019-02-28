public class Location
{
    private String province;
    private String description;
    private String city;

    public Location(String city, String province, String description)
    {
        //constructor
        this.city=city;
        this.province=province;
        this.description=description;
    }

    public String getProvince()
    {
        return this.province;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    public String getDescription()
    {
        return this.description;
    }
    
    public void setProvince(String province)
    {
        this.province=province;
    }
    
    public void setCity(String city)
    {
        this.city=city;
    }
    
    public void setDescription(String description)
    {
        this.description=description;
    }
    
    public void printData()
    {
        
    }
}
