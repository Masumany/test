package com.example.application4;


import java.util.List;

public class JsonData {
    public List<DetailData> data;
    public  int errorCode;
    public  String errorMsg;
    public static class DetailData {
    public int id;
    public String link;
    public String name;
    public int order;
    public  int visible;

    }

}
