package com.example.BnBBooking.exceptions;

import com.example.BnBBooking.dtos.Response;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@RequiredArgsConstructor
public class CustomAuthenticationEntryPoint implements AuthenticationEntryPoint {

    // 注入 ObjectMapper 对象，用来把 Java 对象转成 JSON 格式的字符串
    private final ObjectMapper objectMapper;

    //想要实现entrypoint这个接口，需要重写commence方法
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException)
            throws IOException, ServletException {

        //这个是在DTO中定义好的Response对象
        Response errorResponse = Response.builder()
                .status(HttpStatus.UNAUTHORIZED.value()) //401 invid token
                .message(authException.getMessage())
                .build();

        response.setContentType("application/json");
        response.setStatus(HttpStatus.UNAUTHORIZED.value());
        response.getWriter().write(objectMapper.writeValueAsString(errorResponse));

    }
}
