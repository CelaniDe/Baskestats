package model;

public class Team
{
    private String name;
    private String city;
    private String founded;
    private String CEO;

    public Team() {}

    public Team(String name, String city, String founded, String CEO) {
        this.name = name;
        this.city = city;
        this.founded = founded;
        this.CEO = CEO;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getFounded()
    {
        return founded;
    }

    public void setFounded(String founded)
    {
        this.founded = founded;
    }

    public String getCEO()
    {
        return CEO;
    }

    public void setCEO(String CEO)
    {
        this.CEO = CEO;
    }
}
