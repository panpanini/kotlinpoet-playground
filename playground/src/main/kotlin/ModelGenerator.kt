import com.squareup.kotlinpoet.*
import java.io.File

fun main() {
    generateFile(Model.ITEM).writeTo(File(""))
}

fun generateFile(input: Model): FileSpec {
    return FileSpec.builder(input.packageName, input.name)
            .addType(generateType(input))
            .build()
}

fun generateType(input: Model): TypeSpec {
    TODO()
}

fun generateConstructor(input: Model): FunSpec {
    TODO()
}

fun generateParameter(field: Field): ParameterSpec {
    TODO()
}

fun generateProperties(input: Model): List<PropertySpec> {
    TODO()
}

fun generateProperty(field: Field): PropertySpec {
    TODO()
}