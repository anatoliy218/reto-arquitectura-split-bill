package io.devexpert.splitbill.domain_usercases

import io.devexpert.splitbill.data.TicketData
import io.devexpert.splitbill.data.TicketRepository

class GetTicketDataUseCase(private val repository: TicketRepository) {

    operator fun invoke(): TicketData? = repository.getTicketData()
}