package com.baby_ssu.controllerex.Controller;

import com.baby_ssu.controllerex.dto.PostDto;
import com.baby_ssu.controllerex.service.PostService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/post")
public class PostController {
    PostService postService;
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping ()
    public PostDto getPost(@RequestParam Integer id){
        PostDto result = postService.getPost(id);
        return result;
    }
    @PostMapping
    public String savePost(@RequestBody PostDto postDto){
        System.out.println(postDto.getId());
        System.out.println(postDto.getTitle());
        System.out.println(postDto.getContent());
        System.out.println(postDto.getUsername());
        return "POST /post";
    }
    @RequestMapping(method=RequestMethod.PUT)
    public String updatePost(){
        return "PUT /post";
    }
    @RequestMapping(method=RequestMethod.DELETE)
    public String deletePost(){
        return "DELETE /post";
    }
}
