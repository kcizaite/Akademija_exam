package lt.techin.karolina.exam.blogging.api.dto;

import java.util.Objects;

public class BlogDto {
    private String title;
    private String text;

    public BlogDto() {
    }

    public BlogDto(String title, String text) {
        this.title = title;
        this.text = text;
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

    @Override
    public String toString() {
        return "BlogDto{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BlogDto blogDto = (BlogDto) o;
        return Objects.equals(title, blogDto.title) && Objects.equals(text, blogDto.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, text);
    }
}
