package rock.dong.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.oas.annotations.EnableOpenApi;

@RestController
@Api(tags = "用户管理")
public class HelloController {
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello";
    }
}
