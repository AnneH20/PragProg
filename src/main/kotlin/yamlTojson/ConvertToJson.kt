package yamlTojson

import com.fasterxml.jackson.databind.ObjectMapper
import org.yaml.snakeyaml.Yaml
import java.io.File

fun convertYamlToJson(directoryPath: String) {
    val yaml = Yaml()

    val objectMapper = ObjectMapper()

    val directory = File(directoryPath)
    if (directory.isDirectory) {
        print("Directory: ${directory.name}\n")
    }

    directory
        .listFiles { file ->
            file.extension == "yaml"
        }?.forEach { yamlFile ->
            val jsonFile = File(directory, yamlFile.nameWithoutExtension + ".json")
            try {
                val yamlContent = yaml.load<Map<String, Any>>(yamlFile.inputStream())
                objectMapper.writerWithDefaultPrettyPrinter().writeValue(jsonFile, yamlContent)
                println("Converted ${yamlFile.name} to ${jsonFile.name}")
            } catch (e: Exception) {
                println("Failed to convert ${yamlFile.name} to JSON")
            }
        }
}
