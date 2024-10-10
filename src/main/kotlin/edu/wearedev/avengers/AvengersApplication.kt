package edu.wearedev.avengers

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AvengersApplication

fun main(args: Array<String>) {
	runApplication<AvengersApplication>(*args)
}
