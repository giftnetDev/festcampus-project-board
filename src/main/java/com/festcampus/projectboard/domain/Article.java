package com.festcampus.projectboard.domain;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString

public class Article {
    private Long id;
    private String title;
    private String content;
    private String hashtag;

    private LocalDateTime createdAt;//생성일시
    private String createdBy;//생성자
    private LocalDateTime modifiedAt;//수정일시
    private String modifiedby;//수정자
}
