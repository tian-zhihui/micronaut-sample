package pulsar.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;

@Controller("/")
public class HelloController {
    // @Get(produces = MediaType.TEXT_PLAIN)
    // public String index() {
    // return "Hello World1";
    // }

    @Inject
    private AsyncService asyncService;

    @Get(produces = MediaType.TEXT_PLAIN)
    Mono<String> hello() throws Exception {
        this.asyncService.doTaskOne();
        this.asyncService.doTaskTwo();
        this.asyncService.doTaskThree();
        return Mono.fromSupplier(() -> "Hello World");
    }
}
