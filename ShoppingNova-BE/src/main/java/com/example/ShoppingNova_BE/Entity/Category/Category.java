package com.example.ShoppingNova_BE.Entity.Category;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Category {
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO_INCREMENT 매핑
    private Integer id;

    @Column(nullable = false) // name은 null이 될 수 없음
    private String name;

    @JsonProperty("parent_id")
    @JoinColumn(name = "parent_id") // self-referencing foreign key
    @Column(name = "parent_id")
    private Integer parentId; // 상위 카테고리
}
