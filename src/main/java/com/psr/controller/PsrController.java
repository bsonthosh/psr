package com.psr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psr.Response;

@RestController
@RequestMapping(value = "/")
public class PsrController {

    @GetMapping("/test")
    public Response getHealthCheck() {

	return new Response("200", "SUCCESS", null);
    }

    @GetMapping()
    public String getResult() {

	return "Success";
    }
}
