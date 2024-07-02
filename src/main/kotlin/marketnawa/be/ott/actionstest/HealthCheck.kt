package marketnawa.be.ott.actionstest

import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping
class HealthCheck {

    @RequestMapping("/health")
    fun health(): String {
        return "OK!"
    }
}
