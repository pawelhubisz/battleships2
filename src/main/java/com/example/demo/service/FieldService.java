package com.example.demo.service;

import com.example.demo.model.Field;
import org.springframework.data.util.Streamable;

import java.util.List;

public interface FieldService {
    List<Field> saveFieldAndGetAll(Field field);

}
