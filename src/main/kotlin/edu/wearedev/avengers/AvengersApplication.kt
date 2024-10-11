package edu.wearedev.avengers

import org.flywaydb.core.Flyway
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.config.EnableJpaRepositories


@EnableJpaRepositories(basePackages = ["edu.wearedev.avengers.infra.repository"])
@EntityScan(basePackages = ["edu.wearedev.avengers.infra.entity"])
@SpringBootApplication
class AvengersApplication

fun main(args: Array<String>) {
	runApplication<AvengersApplication>(*args)
}
