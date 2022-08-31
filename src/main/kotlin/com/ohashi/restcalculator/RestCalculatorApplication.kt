package com.ohashi.restcalculator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class RestCalculatorApplication

fun main(args: Array<String>) {
	runApplication<RestCalculatorApplication>(*args)
}
