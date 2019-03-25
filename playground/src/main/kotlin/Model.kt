import java.lang.reflect.Type

data class Model(
        val name: String,
        val packageName: String,
        val fields: List<Field>
) {
    companion object {
        val ITEM = Model(
                "Item",
                "jp.co.panpanini",
                listOf(
                        Field("id", String::class.java, false,"", "The id for the item"),
                        Field("name", String::class.java, false, ""),
                        Field("description", String::class.java, true, "null"),
                        Field("price", Int::class.java, false, "0","price in Yen")
                )
        )
    }
}

data class Field(
        val name: String,
        val type: Type,
        val nullable: Boolean,
        val defaultValue: String,
        val comment: String? = null
)