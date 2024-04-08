package com.example.kortspill;

public class Kort {
    private String type;
    private String nummer;

    public Kort(String type, String nummer) {
        this.type = type;
        this.nummer = nummer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNummer() {
        return nummer;
    }

    public void setNummer(String nummer) {
        this.nummer = nummer;
    }
}
