package lt.techin.karolina.exam.blogging.api;

import lt.techin.karolina.exam.blogging.api.dto.BlogDto;
import lt.techin.karolina.exam.blogging.api.dto.BlogEntityDto;
import lt.techin.karolina.exam.blogging.api.dto.mapper.BlogMapper;
import lt.techin.karolina.exam.blogging.model.BlogEntity;
import lt.techin.karolina.exam.blogging.service.BlogService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static lt.techin.karolina.exam.blogging.api.dto.mapper.BlogMapper.toBlogDto;
import static lt.techin.karolina.exam.blogging.api.dto.mapper.BlogMapper.toBlogEntity;
import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("/api/v1/blog")
public class BlogController {
    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

//    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @GetMapping
    @ResponseBody
    public List<BlogEntityDto> getBlogs() {
        return blogService.getAll().stream()
                .map(BlogMapper::toBlogEntityDto)
                .collect(toList());
    }

//    @GetMapping(value = "/{blogId}", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
//    @GetMapping
//    public ResponseEntity<BlogEntity> getBlogEntity(@PathVariable Long blogId) {
//        var blogOptional = blogService.getById(blogId);
//        var responseEntity = blogOptional
//                .map(blog -> ok(blog))
//                .orElseGet(() -> ResponseEntity.notFound().build());
//        return responseEntity;
//    }

//    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    @PostMapping
    public ResponseEntity<BlogDto> createBlog(@RequestBody BlogDto blogDto) {
        var createdBlog = blogService.createBlog(toBlogEntity(blogDto));

        return ok(toBlogDto(createdBlog));
    }
}
