package lt.techin.karolina.exam.blogging.api.dto.mapper;

import lt.techin.karolina.exam.blogging.api.dto.BlogDto;
import lt.techin.karolina.exam.blogging.api.dto.BlogEntityDto;
import lt.techin.karolina.exam.blogging.model.BlogEntity;

public class BlogMapper {

    public static BlogDto toBlogDto(BlogEntity blogEntity) {
        var blogDto = new BlogDto();
        blogDto.setTitle(blogEntity.getTitle());
        blogDto.setText(blogEntity.getText());
        return blogDto;
    }

    public static BlogEntityDto toBlogEntityDto(BlogEntity blogEntity) {
        var blogDto = new BlogEntityDto();
        blogDto.setTitle(blogDto.getTitle());
        blogDto.setText(blogDto.getText());
        return blogDto;
    }


    public static BlogEntity toBlogEntity(BlogDto blogDto) {
        var blogEntity = new BlogEntity();
        blogEntity.setTitle(blogDto.getTitle());
        blogEntity.setText(blogDto.getText());
        return blogEntity;
    }
}
