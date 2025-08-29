package io.devexpert.splitbill.data

interface TicketDataSource {
    suspend fun processTicket(image: ByteArray): TicketData
}