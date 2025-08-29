package io.devexpert.splitbill.domain_usercases

import io.devexpert.splitbill.data.TicketRepository

class ProcessTicketUseCase(private val repository: TicketRepository) {

    suspend operator fun invoke(imageBytes: ByteArray){
        repository.processTicket(imageBytes)
    }
}