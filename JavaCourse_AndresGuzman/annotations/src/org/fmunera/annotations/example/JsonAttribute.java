package org.fmunera.annotations.example;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAttribute {
    String name() default "";
    boolean capitalize() default false;
}
