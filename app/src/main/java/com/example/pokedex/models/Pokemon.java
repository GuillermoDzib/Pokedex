package com.example.pokedex.models;

public class Pokemon {
    private int number;
    private String name;
    private String url;

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        String[] urlPartes = url.split("/");
        return Integer.parseInt(urlPartes[urlPartes.length - 1]);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
