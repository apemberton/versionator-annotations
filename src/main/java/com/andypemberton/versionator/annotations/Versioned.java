package com.andypemberton.versionator.annotations;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Specifies that a field is Versioned. Applied to fields or getter methods.
 * 
 * @since Versionator 1.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.FIELD })
// TODO consider adding to ElementType.TYPE and ElementType.PACKAGE
public @interface Versioned {

	public static String BEGINNING_OF_TIME = "BEGINNING_OF_TIME";

	public static String END_OF_TIME = "END_OF_TIME";

	String since();

	String until() default END_OF_TIME;
}