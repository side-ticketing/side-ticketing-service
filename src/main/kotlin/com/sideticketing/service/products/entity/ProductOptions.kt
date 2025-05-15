package com.sideticketing.service.products.entity

import com.sideticketing.service.global.entity.BaseEntity
import jakarta.persistence.*
import org.hibernate.annotations.Comment
import java.math.BigDecimal
import java.time.LocalDateTime

@Entity
class ProductOptions(
    productOptionId: Long = 0,

    @Comment("옵션 명")
    val productOptionName: String,

    @Comment("가용 수량")
    val availableQuantity: Long,

    @Comment("총 수량")
    val totalQuantity: Long,

    @Comment("공연 일시")
    val showAt: LocalDateTime,

    @Comment("등급")
    val grade: String,

    @Comment("소비자가")
    val consumerPrice: BigDecimal,

    @AttributeOverride(
        name = "actorName",
        column = Column(name = "actorName")
    )
    @AttributeOverride(
        name = "roleName",
        column = Column(name = "roleName")
    )
    @Embedded
    val casting: Castings,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id")
    val product: Products
): BaseEntity(productOptionId)
