package de.hofuniversity.nlehmann.microservice.barservice;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_bar")
public class BarEntity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "content")
    private String content;


    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
