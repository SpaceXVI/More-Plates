package ms55.moreplates.common.plugin.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Plugin {
    String modid();

    String modname();

    boolean checkModid() default true;

    boolean checkConfig() default true;

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.METHOD})
    @interface registry {
    }
}