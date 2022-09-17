package pulsar.micronaut;

import java.util.Date;

import io.micronaut.runtime.Micronaut;

public class Application {
    public static void main(String[] args) {
        Date start = new Date();
        Micronaut.run(Application.class, args);
        Date end = new Date();
        System.out.println("启动耗时:" + (end.getTime() - start.getTime()));
    }
}
