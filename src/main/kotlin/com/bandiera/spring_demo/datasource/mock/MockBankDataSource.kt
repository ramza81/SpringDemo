package com.bandiera.spring_demo.datasource.mock

import com.bandiera.spring_demo.datasource.BankDataSource
import com.bandiera.spring_demo.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource: BankDataSource {

    val banks = listOf(
            Bank("1234", 3.0, 1),
            Bank("1235", 1.0, 0),
            Bank("1236", 0.0, 14),
    )

    override fun retrieveBanks(): Collection<Bank> = banks
}