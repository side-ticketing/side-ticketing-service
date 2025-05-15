package com.sideticketing.service.products.entity

import jakarta.persistence.*
import org.hibernate.annotations.Comment



@Embeddable
class Castings(
    actorName: String,
    roleName: String,
) {
    @Comment("배우 이름")
    var actorName: String = actorName
        protected set

    @Comment("극중 배역 이름")
    var roleName: String = roleName
    protected set

}