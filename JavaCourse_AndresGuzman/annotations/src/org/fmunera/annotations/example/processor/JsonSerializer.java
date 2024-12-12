package org.fmunera.annotations.example.processor;

import org.fmunera.annotations.example.Init;
import org.fmunera.annotations.example.JsonAttribute;
import org.fmunera.annotations.example.processor.exceptions.JsonSerializerException;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {

    public static void initializeObject(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializerException("El objeto a serializar no puede ser null");
        }

        Method[] methods = object.getClass().getDeclaredMethods();

        Arrays.stream(methods)
                .filter(m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {

                    m.setAccessible(true);
                    try {
                        m.invoke(object);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializerException("Error al serializar, no se puede inicializar el objeto: "
                        + e.getMessage());
                    }
                });


    }

    public static String convertToJson(Object object){

        if(Objects.isNull(object)){
            throw new JsonSerializerException("El objeto a serializar no puede ser null");
        }

        initializeObject(object);

        Field[] fields = object.getClass().getDeclaredFields();

        return Arrays.stream(fields)
                .filter(f -> f.isAnnotationPresent(JsonAttribute.class))
                .map(f -> {
                    f.setAccessible(true);
                    String name = f.getAnnotation(JsonAttribute.class).name().isEmpty()
                            ? f.getName() : f.getAnnotation(JsonAttribute.class).name();

                    try {
                        Object value = f.get(object);

                        if(f.getAnnotation(JsonAttribute.class).capitalize() && value instanceof String newValue){
                            newValue = Arrays.stream(newValue.split(" "))
                                    .map(x -> x.substring(0,1).toUpperCase() +
                                            x.substring(1).toLowerCase())
                                    .collect(Collectors.joining(" "));

                            f.set(object, newValue);
                        }
                        return "\""+name+"\":\""+f.get(object)+"\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializerException("Error al serializar a json: "+ e.getMessage());
                    }
                })
                .reduce("{", (a,b) -> {
                    if("{".equals(a)){
                        return a + b;
                    }
                    return a +", "+ b;
                }).concat("}");
    }
}
