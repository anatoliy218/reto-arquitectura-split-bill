package io.devexpert.splitbill.domain_usercases

import io.devexpert.splitbill.data.ScanCounterRepository
import kotlinx.coroutines.flow.Flow

class GetScansRemainingUseCase(private val repository: ScanCounterRepository ) {

    operator fun invoke(): Flow<Int> = repository.scansRemaining
}