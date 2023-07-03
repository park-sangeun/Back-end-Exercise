package com.baby_ssu.controllerex.service;

import com.baby_ssu.controllerex.dto.PostDto;
import org.springframework.stereotype.Service;

public class PostService {
    public PostDto getPost(Integer id){
        System.out.println("find post data from database" + id);
        System.out.println("validate data from database");
        System.out.println("process data if necessary");

        return new PostDto(id, "title", "this is content", "pse");

    }
}
