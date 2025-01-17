package otus.homework.coroutines

import com.google.gson.annotations.SerializedName

data class Fact(
	@field:SerializedName("createdAt")
	val createdAt: String,
	@field:SerializedName("deleted")
	val deleted: Boolean,
	@field:SerializedName("_id")
	val id: String,
	@field:SerializedName("text")
	var text: String,
	@field:SerializedName("source")
	var source: String,
	@field:SerializedName("used")
	val used: Boolean,
	@field:SerializedName("type")
	val type: String,
	@field:SerializedName("user")
	val user: String,
	@field:SerializedName("updatedAt")
	val updatedAt: String
)

data class ViewCat(
	@field:SerializedName("file")
	val file: String
)

fun FactShort(text: String, source: String): Fact {
	return Fact(createdAt = "", deleted = false, id = "", text = text, source = source, type = "", updatedAt = "", used = false, user = ""  )
}