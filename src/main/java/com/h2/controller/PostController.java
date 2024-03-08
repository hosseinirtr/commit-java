package com.h2.controller;

import com.h2.entity.Post;
import com.h2.exceptions.PostNoFoundException;
import com.h2.services.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/api/post")
public class PostController {
    private final PostService postService;

    @PostMapping(value = "/savePost")
    public ResponseEntity<Void> saveOrUpdatePost(@RequestBody Post post) {
        log.info("call/savePost " + post);
        postService.savePost(post);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/deletePost/{postId}")
    public ResponseEntity<Void> saveOrUpdatePost(@PathVariable(value = "postId", required = true) String postId) {
        postService.deletePostById(Integer.parseInt(postId));
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/getAllPost")
    public ResponseEntity<List<Post>> getAllPost() {
        List<Post> allPost = postService.getAllPost();
        System.out.println(allPost.isEmpty());
        if(allPost.isEmpty()){
            throw new PostNoFoundException("No post created yet!");
        }
        return ResponseEntity.ok(allPost);
    }

    @PostMapping(value = "/getPostById")
    public ResponseEntity<Post> getPostById(@RequestParam("postId") String postId) {
        Post post = postService.getPost(Integer.parseInt(postId));
//        return new ResponseEntity<>(post, HttpStatus.OK);
        return ResponseEntity.ok(post);
    }


}
