package com.mamoru.bookstore.domain.security;

import org.springframework.security.core.GrantedAuthority;

import java.io.Serializable;

public class Authority implements GrantedAuthority, Serializable {
    @Override
    public String getAuthority() {
        return null;
    }
}
