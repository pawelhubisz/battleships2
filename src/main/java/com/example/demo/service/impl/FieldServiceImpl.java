package com.example.demo.service.impl;

import com.example.demo.model.Field;
import com.example.demo.repository.FieldRepository;
import com.example.demo.service.FieldService;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FieldServiceImpl implements FieldService  {

    private FieldRepository fieldRepository;

    public FieldServiceImpl(FieldRepository fieldRepository) {
        this.fieldRepository = fieldRepository;
    }

    @Override
    public List<Field> saveFieldAndGetAll(Field field) {
        fieldRepository.save(field);
        return Streamable.of(fieldRepository.findAll()).toList();
    }

}
