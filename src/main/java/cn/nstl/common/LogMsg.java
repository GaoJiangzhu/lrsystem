package cn.nstl.common;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author dongzeliang
 * @version 1.0
 * @Description
 * @date 2018/7/12
 */
@Target(METHOD)
@Retention(RUNTIME)
@Documented
public @interface LogMsg {
    String value() default "";
}
