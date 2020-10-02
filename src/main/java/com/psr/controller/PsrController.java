package com.psr.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psr.Request;
import com.psr.Response;

@RestController
@RequestMapping(value = "/")
public class PsrController {

    @GetMapping()
    public String getResult() {

	return "Success";
    }

    @GetMapping("/test")
    public Response getHealthCheck() {

	return new Response("200", "SUCCESS", null);
    }

    @PostMapping("/test")
    public Response postHealthCheck(@RequestBody Request request) {

	return new Response("200", "SUCCESS", request.getInput());
    }

    @PutMapping("/test")
    public Response updateHealthCheck(@RequestBody Request request) {

	return new Response("200", "SUCCESS", request.getInput());
    }

    @DeleteMapping("/test")
    public Response deleteHealthCheck(@RequestBody Request request) {

	return new Response("200", "SUCCESS", request.getInput());
    }
}
