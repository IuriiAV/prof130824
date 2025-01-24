package com.telran.lesson20.example;

public interface Convertor <Dto, Entity> {

    Dto toDto(Entity entity);

    Entity toEntity(Dto dto);

}
