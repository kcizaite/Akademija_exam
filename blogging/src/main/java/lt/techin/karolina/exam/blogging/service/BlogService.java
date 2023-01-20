package lt.techin.karolina.exam.blogging.service;

import lt.techin.karolina.exam.blogging.dao.BlogRepository;
import lt.techin.karolina.exam.blogging.model.BlogEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    private final BlogRepository blogRepository;
    @Autowired
    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public BlogEntity createBlog(BlogEntity blogEntity) {
        return blogRepository.save(blogEntity);
    }

    public Optional<BlogEntity> getById(Long id) {
        return blogRepository.findById(id);
    }

    public List<BlogEntity> getAll() {
        return blogRepository.findAll();
    }
}
