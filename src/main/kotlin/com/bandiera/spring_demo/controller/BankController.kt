package com.bandiera.spring_demo.controller

import com.bandiera.spring_demo.model.Bank
import com.bandiera.spring_demo.service.BankService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/banks")
class BankController private constructor(val service: BankService) {

    @GetMapping
    fun getBanks(): Collection<Bank> = service.getBanks()


}