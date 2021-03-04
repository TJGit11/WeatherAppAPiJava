package com.tts.WeatherApp.model;

import java.util.List;
import java.util.Map;

public class Response {
    private List<Map<String, String>> weather;
    private Map <String, String> coord;
    private Map <String, String> main;
    private Map <String, String> wind;
    private Map <String, String> clouds;
    private Map <String, String> sys;
    private String id;
    private String name;
    private String cod;
    private String base;
    private String dt;

}
