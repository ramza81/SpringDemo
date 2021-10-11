package com.bandiera.spring_demo.service

import com.bandiera.spring_demo.datasource.BankDataSource
import com.bandiera.spring_demo.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val dataSource: BankDataSource) {

    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()


}