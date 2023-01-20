package lt.techin.karolina.exam.blogging.api.dto;

import java.util.Objects;

public class CommentEntityDto extends CommentDto{
    private Long id;
    public CommentEntityDto() {
    }

    public CommentEntityDto(Long id, String name, String comment) {
        super(name, comment);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommentEntityDto that = (CommentEntityDto) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "CommentEntityDto{" +
                "id=" + id +
                '}';
    }

    public void setName(String name) {
    }
}
