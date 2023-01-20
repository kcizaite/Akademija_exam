package lt.techin.karolina.exam.blogging.service;

import lt.techin.karolina.exam.blogging.dao.CommentRepository;
import lt.techin.karolina.exam.blogging.model.CommentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    private final CommentRepository commentRepository;
    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public List<CommentEntity> getAll() {
        return commentRepository.findAll();
    }

    public CommentEntity create(CommentEntity commentEntity){
        return commentRepository.save(commentEntity);
    }

}
