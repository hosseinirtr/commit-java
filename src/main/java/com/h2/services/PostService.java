package com.h2.services;

import com.h2.Dao.ClientDao;
import com.h2.Dao.PostDao;
import com.h2.entity.Client;
import com.h2.entity.Post;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
@Slf4j
public class PostService {

    private final PostDao postDao;
    private final ClientDao clientDao;

    public void savePost(Post post) {
        Client author = clientDao.findById(post.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found with ID: " + post.getAuthorId()));
        post.setAuthor(author);

        log.info("save post id-{}", post);
        postDao.save(post);

    }

    public Post getPost(int postId) {
        log.info("Client with username: id-{}", postId);
        return postDao.getReferenceById(postId);
    }

    public void deletePost(Post post) {
        log.info("delete post by id: id-{}", post);
        postDao.delete(post);
    }

    public void deletePostById(int postId) {
        log.info("delete post by id: id-{}", postId);
        postDao.deleteById(postId);
    }

    public List<Post> getAllPost() {
        System.out.print("getAllPost");
        return postDao.findAll();
    }
}
