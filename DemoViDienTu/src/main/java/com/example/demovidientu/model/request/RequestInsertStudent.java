package com.example.demovidientu.model.request;

import com.example.demovidientu.model.Level;
import lombok.Data;

@Data
public class RequestInsertStudent {
    private String name;
    private int age;
    private Level level;
    private String classAddress;
}
