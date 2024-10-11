package edu.wearedev.avengers.application.web.resource.request

import edu.wearedev.avengers.domain.model.Avenger
import javax.validation.constraints.*


class AvengerRequest(
    @field:NotNull
    @field:NotEmpty
    @field:NotBlank
    val nick: String,
    @field:NotNull
    @field:NotEmpty
    @field:NotBlank
    val person: String,
    val description: String? = null,
    val history: String? = null

) {
    fun toAvenger() = Avenger(
        nick = nick,
        person = person,
        description = description,
        history = history
    )

    companion object {
        fun to(id: Long?, request: AvengerRequest) = Avenger(
            id = id,
            nick = request.nick,
            person = request.person,
            description =  request.description,
            history = request.history
        )
    }
}