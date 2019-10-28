package com.jemtron.swaggerexample.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rest/hello")
@Api(value = "HelloWorld Resouce", description = "shows Hello World")
public class HelloResource {

    @ApiOperation(value = "Returns Hello World")
    @ApiResponses(value = { @ApiResponse(code = 100, message = "100 is the message"),
            @ApiResponse(code = 200, message = "Successful Hello World") })

    @GetMapping
    public String hello() {
        return "Hello World";
    }

    @ApiOperation(value = "Returns Hello World")
    @PostMapping("/add")
    public String helloAdd(@RequestBody final String hello) {
        return hello;
    }

    @PutMapping("/put")
    public String helloPut(@RequestBody final String hello) {
        return hello;
    }
}
