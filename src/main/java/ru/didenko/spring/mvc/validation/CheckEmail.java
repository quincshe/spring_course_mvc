package ru.didenko.spring.mvc.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmilValidator.class)
public @interface CheckEmail {

    public String value() default "@gmail.com";
    public String message() default "email must ends with @gmail.com";

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};


}
