package com.example.retailer.api.distributor

import javax.persistence.*

/**
 * Уведомление об изменении заказа
 */
@Entity
data class OrderInfo(
    /**
     * Уникальный идентификатор заказа
     *
     * @see com.example.retailer.api.distributor.Item#id
     */
    @Id
    val orderId: String,

    /**
     * Статус заказа:
     *  Created
     *
     */
    @Enumerated(value = EnumType.STRING)
    var status: OrderStatus,

    /**
     * Контрольная сумма
     */
    @Column(nullable = false)
    val signature: String,

)