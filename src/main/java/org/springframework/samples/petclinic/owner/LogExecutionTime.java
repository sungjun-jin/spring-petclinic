package org.springframework.samples.petclinic.owner;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD) // annotation의 사용 대상
@Retention(RetentionPolicy.RUNTIME) //annotation의 정보 유지 기간
public @interface LogExecutionTime {
}
