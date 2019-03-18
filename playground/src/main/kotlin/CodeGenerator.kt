import com.squareup.kotlinpoet.*
import java.io.File
import java.io.FileWriter

class CodeGenerator {

    fun generate(): FileSpec {
        TODO()
    }
}

fun main(args: Array<String>) {
    val generated = CodeGenerator().generate()
    val writer = FileWriter(File("GeneratedClass.kt"))
    writer.use {
        it.write(generated.toString())
    }
}