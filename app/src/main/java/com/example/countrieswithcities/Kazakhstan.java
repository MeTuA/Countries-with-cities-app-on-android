package com.example.countrieswithcities;

public class Kazakhstan {
    private String city;
    private String description;
    private int imageResId;

    public static final Kazakhstan[] cities = {
            new Kazakhstan("Almaty", "South-east city", R.drawable.almaty),
            new Kazakhstan("Nur-Sultan", "Capital city", R.drawable.astana),
            new Kazakhstan("Shymkent", "Souty city", R.drawable.shymkent)
    };

    private Kazakhstan(String city, String desc, int imageResId){
        this.city = city;
        this.description = desc;
        this.imageResId = imageResId;
    }

    public String getCity(){
        return city;
    }

    public String getDescription(){
        return description;
    }

    public int getImageResId(){
        return imageResId;
    }

    public String toString(){
        return this.city;
    }


}
