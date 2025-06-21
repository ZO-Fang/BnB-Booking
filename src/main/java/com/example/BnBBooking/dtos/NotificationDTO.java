package com.example.BnBBooking.dtos;

import com.example.BnBBooking.enums.NotificationType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class NotificationDTO {

    private Long id;
    private String subject;
    private String recipient;
    private String body;
    private String bookingReference;
    private NotificationType notificationType;
    private LocalDateTime createdAt;
}
