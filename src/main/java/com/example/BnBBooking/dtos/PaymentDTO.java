package com.example.BnBBooking.dtos;

import com.example.BnBBooking.enums.PaymentGateway;
import com.example.BnBBooking.enums.PaymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class PaymentDTO {

    private Long id;
    private BookingDTO booking;

    private String transactionId;
    private BigDecimal amount;

    private PaymentGateway paymentMethod;

    private LocalDateTime paymentDate;
    private PaymentStatus paymentStatus;
    private String bookingReference;
    private String failureReason;
    private String approvalLink;

}
