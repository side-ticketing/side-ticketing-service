package com.sideticketing.service.products.entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.math.BigDecimal


@Entity
class Prices(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Comment("등급")
    val grade: String,

    @Comment("소비자가")
    val consumerPrice: BigDecimal,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    val product: Products
)
