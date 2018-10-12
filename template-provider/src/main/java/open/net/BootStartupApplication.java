package open.net;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class BootStartupApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(BootStartupApplication.class)
                .web(WebApplicationType.NONE).run(args);
    }

}
