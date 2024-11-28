package com.example.ShoppingNova_BE.Entity.Product;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int price;

    private float rating;

    @JsonProperty("rate_num") // JSON의 rate_num과 매핑
    private int rateNum;

    @Column(name = "category_id") // DB 컬럼 이름을 명시적으로 매핑
    private int category_id;

    @JsonProperty("release_date") // JSON의 release_date와 매핑
    private int releaseDate;

    private float weight;

    @JsonProperty("size_x")
    private int sizeX;

    @JsonProperty("size_y")
    private int sizeY;

    @JsonProperty("size_z")
    private int sizeZ;

    private String resolution; // TV에 해당 (null 가능)
    private Integer resolution1; // TV 해상도 가로
    private Integer resolution2; // TV 해상도 세로

    private String plugin; // TV 전원
    private String processor; // TV AI 프로세서
    private String sound; // TV 스피커 출력

    private String color; // 냉장고 색상
    private String energy; // 냉장고 에너지 효율 등급

    @JsonProperty("door_count")
    private int doorCount;

    @JsonProperty("volume_cold")
    private int volumeCold;

    @JsonProperty("volume_freeze")
    private int volumeFreeze;

    // Getter 및 Setter 생략
    // 필요한 경우 Lombok(@Getter/@Setter/@Data) 사용 가능
}
