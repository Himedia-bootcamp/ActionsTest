package marketnawa.be.ott.actionstest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
class ActionsTestApplication

fun main(args: Array<String>) {
    runApplication<ActionsTestApplication>(*args)
}
