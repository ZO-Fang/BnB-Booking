package com.example.BnBBooking.dtos;

import com.example.BnBBooking.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Response {

    private int status;
    private String message;

    //login
    private String token;
    private UserRole role;
    private Boolean isActive;
    private String expirationTime;

    //user data output
    private UserDTO user;
    private List<UserDTO> users;

    //booking data output
    private BookingDTO booking;
    private List<BookingDTO> bookings;

    //Room data output
    private RoomDTO room;
    private List<RoomDTO> rooms;

    //payment data output
    private PaymentDTO payment;
    private List<PaymentDTO> payments;

    //notification data output
    private NotificationDTO notification;
    private List<NotificationDTO> notifications;

    private final LocalDateTime timestamp = LocalDateTime.now();

}
