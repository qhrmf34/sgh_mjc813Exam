package com.mjc.studyjava.com.ch15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Board {
    private String subject;
    private String content;
    private String writer;
}
