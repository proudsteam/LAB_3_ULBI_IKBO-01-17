package com.example.rpp_lab_3;

public class Students {

    private String fio;
    private String id;
    private String date;

    public Students(String fio, String id, String date) {
        this.fio = fio;
        this.id = id;
        this.date = date;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
