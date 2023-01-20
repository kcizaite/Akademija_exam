package lt.techin.karolina.exam.blogging.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
public class BlogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotBlank
    private String title;
    @NotBlank
    private String text;

    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    @JoinColumn(name = "commentEntity_id")
    private CommentEntity commentEntity;

    public BlogEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public CommentEntity getCommentEntity() {
        return commentEntity;
    }

    public void setCommentEntity(CommentEntity commentEntity) {
        this.commentEntity = commentEntity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogEntity that = (BlogEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(text, that.text) && Objects.equals(commentEntity, that.commentEntity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, text, commentEntity);
    }
}
