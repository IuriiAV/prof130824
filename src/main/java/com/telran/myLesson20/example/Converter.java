package com.telran.myLesson20.example;

public interface Converter<Dto, Entity> {

    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);
}
