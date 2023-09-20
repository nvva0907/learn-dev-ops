package com.deploy.apps.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/base")
public class BaseController {

    @GetMapping
    public Object getMapping() {
        return "Base Controller Version 1.0";
    }
}
