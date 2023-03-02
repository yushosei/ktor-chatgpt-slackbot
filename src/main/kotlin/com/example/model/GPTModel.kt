package com.example.model

import com.google.gson.annotations.SerializedName
import io.ktor.server.application.*
import kotlinx.serialization.Serializable

@Serializable
data class GPTRequest(
    @SerializedName("model") var model: String? = null,
    @SerializedName("messages") var messages: ArrayList<Messages> = arrayListOf()
)

@Serializable
data class Messages(
    @SerializedName("role") var role: String? = null,
    @SerializedName("content") var content: String? = null
)

@Serializable
data class GPTResponse(
    @SerializedName("id") var id: String? = null,
    @SerializedName("object") var obj: String? = null,
    @SerializedName("created") var created: Int? = null,
    @SerializedName("model") var model: String? = null,
    @SerializedName("usage") var usage: Usage? = Usage(),
    @SerializedName("choices") var choices: ArrayList<Choices> = arrayListOf()
)

@Serializable
data class Usage(
    @SerializedName("prompt_tokens") var promptTokens: Int? = null,
    @SerializedName("completion_tokens") var completionTokens: Int? = null,
    @SerializedName("total_tokens") var totalTokens: Int? = null
)

@Serializable
data class Choices(
    @SerializedName("message") var message: Messages? = Messages(),
    @SerializedName("finish_reason") var finishReason: String? = null,
    @SerializedName("index") var index: Int? = null
)