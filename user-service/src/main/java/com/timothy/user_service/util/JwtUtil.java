package com.timothy.user_service.util;

import com.timothy.user_service.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.security.Key;
import io.jsonwebtoken.security.Keys;
import java.security.KeyStore;

@Component
@RequiredArgsConstructor
public class JwtUtil {

    private final UserService userService;
}
