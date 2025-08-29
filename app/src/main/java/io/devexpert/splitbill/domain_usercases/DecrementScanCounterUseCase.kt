package io.devexpert.splitbill.domain_usercases

import io.devexpert.splitbill.data.ScanCounterRepository

class DecrementScanCounterUseCase(private val scanCounterRepository: ScanCounterRepository) {

    suspend operator fun invoke(){
        scanCounterRepository.decrementScan()
    }
}