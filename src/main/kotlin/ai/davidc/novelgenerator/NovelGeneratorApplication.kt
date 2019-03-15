package ai.davidc.novelgenerator

import org.apache.commons.logging.LogFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NovelGeneratorApplication(val model: Model) : CommandLineRunner {
    private val logger = LogFactory.getLog(NovelGeneratorApplication::class.java)
    
    override fun run(vararg args: String?) {
//        model.load()
        model.train(5000)
//        logger.info("Generated novel: ${model.generate("I", 500)}")
    }
}

fun main(args: Array<String>) {
    runApplication<NovelGeneratorApplication>(*args)
}
