package com.sideticketing.service.products.entity

import com.sideticketing.service.global.entity.BaseEntity
import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
class Products(
    productId: Long = 0,

    @Comment("제목 (상품명)")
    val productName: String,

    @Comment("공연 썸네일")
    val thumbnail: String?,

    @Comment("장소")
    val place: String,

    @Comment("공연 시작일")
    val showStartAt: LocalDateTime,

    @Comment("공연 종료일")
    val showEndAt: LocalDateTime,

    @Comment("공연 시간")
    val showDuration: Int,

    @Comment("관람 연령")
    val viewingAge: Int,

    @OneToMany(mappedBy = "product", cascade = [CascadeType.MERGE], orphanRemoval = true, fetch = FetchType.LAZY)
    val consumerPrices: List<Prices> = emptyList(),

    @OneToMany(mappedBy = "product", cascade = [CascadeType.MERGE], orphanRemoval = true, fetch = FetchType.LAZY)
    val productOptions: List<ProductOptions>  = emptyList(),

): BaseEntity(productId)





