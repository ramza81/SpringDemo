package com.bandiera.spring_demo.datasource

import com.bandiera.spring_demo.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}