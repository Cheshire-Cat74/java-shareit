package ru.practicum.shareit.item.dto;

import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommentDto {

    long id;

    String text;

    String authorName;

    LocalDateTime created;

    public long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getAuthorName() {
        return authorName;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }
}
