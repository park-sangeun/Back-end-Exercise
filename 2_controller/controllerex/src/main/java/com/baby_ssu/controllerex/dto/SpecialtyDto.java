package com.baby_ssu.controllerex.dto;

public class SpecialtyDto {
    String name;
    String level;

    public String getName() {
        return name;
    }

    public String getLevel() {
        return level;
    }

    public SpecialtyDto(String name, String level) {
        this.name = name;
        this.level = level;
    }
}
