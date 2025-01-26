package com.telran.summary2401_lesson20.example;

public interface Converter <Dto, Entity> {

    Dto eoDto(Entity entity);

    Entity toEntity(Dto dto);

}
