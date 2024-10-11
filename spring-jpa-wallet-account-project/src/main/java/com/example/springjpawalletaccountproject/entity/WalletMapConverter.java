package com.example.springjpawalletaccountproject.entity;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import org.thymeleaf.util.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

@Converter
public class WalletMapConverter implements AttributeConverter<Map<String,Object>,String> {
    private static Type MAP_TYPE = new TypeToken<Map<String, String>>() {}.getType();
    private static Gson GSON = new Gson();

    @Override
    public String convertToDatabaseColumn(Map<String, Object> attribute) {
        if(attribute == null) return "";
        return GSON.toJson(attribute);
    }

    @Override
    public Map<String, Object> convertToEntityAttribute(String dbData) {
        if(StringUtils.isEmpty(dbData)) return new HashMap<>();
        return GSON.fromJson(dbData, MAP_TYPE);
    }
}
