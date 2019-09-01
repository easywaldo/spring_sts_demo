package com.model;

public class SearchParam
{
    private String Id;

    private String Name;

    private String Email;

    private int Age;

    public void setId(String id)
    {
        Id = id;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public void setEmail(String email)
    {
        Email = email;
    }

    public void setAge(int age)
    {
        Age = age;
    }

    public String getId()
    {
        return Id;
    }

    public String getName()
    {
        return Name;
    }

    public String getEmail()
    {
        return Email;
    }

    public int getAge()
    {
        return Age;
    }
}