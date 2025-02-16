package com.telran.summary1402.task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME) // Аннотация доступна во время выполнения
@Target(ElementType.METHOD) // Аннотация применяется только к методам
public @interface EventListener {
    Status status(); // Параметр для указания статуса
}
