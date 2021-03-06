package com.avocado.tatevik.retail.service.orderproduct.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class OrderProductCreationModel {

    private Long productId;

    private Long orderId;

    private BigDecimal amount;

    private String comment;

    private BigDecimal originalPrice;

    private BigDecimal discount;

    private BigDecimal totalPrice;
}
