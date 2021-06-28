package rock.dong.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.ArrayList;

@Configuration
@EnableOpenApi //开启swagger2


public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).groupName("test");
    }

    private ApiInfo apiInfo() {

        Contact contact = new Contact("rock", "localhost", "rock.dong@sap.com");
        return new ApiInfo("rock", "test", "1.0", "localhost", contact, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList());
    }
     /*   private ApiInfo apiInfo() {
            return new ApiInfoBuilder().title("API Reference").version("1.0.0")
                    .description("something")
                    .build();
        }*/

}
