package lt.techin.karolina.exam.blogging.api.dto.mapper;

import lt.techin.karolina.exam.blogging.api.dto.CommentDto;
import lt.techin.karolina.exam.blogging.api.dto.CommentEntityDto;
import lt.techin.karolina.exam.blogging.model.CommentEntity;

public class CommentMapper {
    public static CommentDto toCommentDto(CommentEntity commentEntity) {
        var commentDto = new CommentDto();
        commentDto.setName(commentDto.getName());
        commentDto.setComment(commentDto.getComment());
        return commentDto;
    }

    public static CommentEntity toCommentEntity(CommentDto commentDto) {
        var commentEntity = new CommentEntity();
        commentEntity.setName(commentDto.getName());
        commentEntity.setComment(commentDto.getComment());
        return commentEntity;
    }

    public static CommentEntityDto toCommentEntityDto(CommentEntity commentEntity) {
        var commentDto = new CommentEntityDto();
        commentDto.setId(commentEntity.getId());
        commentDto.setName(commentEntity.getName());
        commentDto.setComment(commentEntity.getComment());
        return commentDto;
    }
}
