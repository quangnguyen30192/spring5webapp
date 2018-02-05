package com.practice.spring5webapp.model;

import lombok.Builder;
import lombok.ToString;

@Builder
@ToString
public class DatabaseProp {

    private String username;
    private String password;
    private String url;
}
