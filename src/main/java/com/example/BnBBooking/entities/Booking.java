package com.example.BnBBooking.entities;


import com.example.BnBBooking.enums.BookingStatus;
import com.example.BnBBooking.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "bookings")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne  //意思是，多个booking可以属于同一个用户
    @JoinColumn(name = "user_id")  //意思是，在booking这个表里有user字段，它通过user_id建立连接
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    private LocalDate checkInDate;
    private LocalDate checkOutDate;

    private BigDecimal totalPrice;
    private String bookingReference;
    private LocalDateTime createdAt;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;















}
