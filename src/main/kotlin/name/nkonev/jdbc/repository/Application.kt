package name.nkonev.jdbc.repository

import org.slf4j.LoggerFactory
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@EnableScheduling
@SpringBootApplication
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}

@RestController
class AppController(private val testEntityRepository: TestEntityRepository) {

	@GetMapping("/test")
	fun getTestEntities(): Iterable<TestEntity> {
		return testEntityRepository.findAll()
	}

}

@Component
class PeriodicPrinter(private val testEntityRepository: TestEntityRepository) {
	val logger = LoggerFactory.getLogger(this::class.java)

	@Scheduled(cron = "* * * * * *")
	fun print() {
		testEntityRepository.findAll().forEach { testEntity -> logger.info("Row {}", testEntity) }
	}
}