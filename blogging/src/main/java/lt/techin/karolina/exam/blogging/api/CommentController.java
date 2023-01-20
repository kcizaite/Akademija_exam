package lt.techin.karolina.exam.blogging.api;

import lt.techin.karolina.exam.blogging.api.dto.CommentDto;
import lt.techin.karolina.exam.blogging.api.dto.CommentEntityDto;
import lt.techin.karolina.exam.blogging.api.dto.mapper.CommentMapper;
import lt.techin.karolina.exam.blogging.service.CommentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static lt.techin.karolina.exam.blogging.api.dto.mapper.CommentMapper.toCommentDto;
import static lt.techin.karolina.exam.blogging.api.dto.mapper.CommentMapper.toCommentEntity;
import static org.springframework.http.ResponseEntity.ok;

@Controller
@RequestMapping("/api/v1/comments")
public class CommentController {
    private final CommentService commentService;

    public CommentController(CommentService commentService) {
        this.commentService = commentService;
    }
    @GetMapping
    @ResponseBody
    public List<CommentEntityDto> getComments() {
        return commentService.getAll().stream()
                .map(CommentMapper::toCommentEntityDto)
                .collect(toList());
    }

    @PostMapping
    public ResponseEntity<CommentDto> createComment(@Valid @RequestBody CommentDto commentDto) {
        var createdComment = commentService.create(toCommentEntity(commentDto));

        return ok(toCommentDto(createdComment));
    }

}
