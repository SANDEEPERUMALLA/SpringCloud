package com.sandeep.SpringConfigClient.resources;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/words")
public class PropertyController {

    @Value("${lucky-word}")
    private String word;

    @GetMapping("/word")
    String getWord(){

        return word;

    }
}
