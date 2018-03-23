package com.sandeep.lab4sentence.resource;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@RestController
public class SentenceResource {

    @Autowired
    private DiscoveryClient discoveryClient;


    @GetMapping("sentence")
    public String getSentence(){

        return getWord("lab-4-subject");


    }


    String getWord(String service){
        List<ServiceInstance> instances =
                discoveryClient.getInstances(service);

        System.out.println("Words Services Instances Size"+instances.size());

        URI uri = instances.get(1).getUri();

       return new RestTemplate().getForObject(uri,String.class);


    }



}
