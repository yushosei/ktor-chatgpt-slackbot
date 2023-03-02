package com.example.model

import com.google.gson.annotations.SerializedName
import io.ktor.server.application.*


data class SocketEvent(
    @SerializedName("envelope_id") var envelopeId: String? = null,
    @SerializedName("payload") var payload: Payload? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("accepts_response_payload") var acceptsResponsePayload: Boolean? = null,
    @SerializedName("retry_attempt") var retryAttempt: Int? = null,
    @SerializedName("retry_reason") var retryReason: String? = null
)


data class Elements(
    @SerializedName("type") var type: String? = null,
    @SerializedName("user_id") var userId: String? = null,
    @SerializedName("elements") var elements: ArrayList<Elements> = arrayListOf()
)

data class Blocks(
    @SerializedName("type") var type: String? = null,
    @SerializedName("block_id") var blockId: String? = null,
    @SerializedName("elements") var elements: ArrayList<Elements> = arrayListOf()

)

data class Event(
    @SerializedName("client_msg_id") var clientMsgId: String? = null,
    @SerializedName("type") var type: String? = null,
    @SerializedName("text") var text: String? = null,
    @SerializedName("user") var user: String? = null,
    @SerializedName("ts") var ts: String? = null,
    @SerializedName("blocks") var blocks: ArrayList<Blocks> = arrayListOf(),
    @SerializedName("team") var team: String? = null,
    @SerializedName("channel") var channel: String? = null,
    @SerializedName("event_ts") var eventTs: String? = null
)

data class Authorizations(
    @SerializedName("team_id") var teamId: String? = null,
    @SerializedName("user_id") var userId: String? = null,
    @SerializedName("is_bot") var isBot: Boolean? = null,
    @SerializedName("is_enterprise_install") var isEnterpriseInstall: Boolean? = null
)

data class Payload(
    @SerializedName("token") var token: String? = null,
    @SerializedName("team_id") var teamId: String? = null,
    @SerializedName("api_app_id") var apiAppId: String? = null,
    @SerializedName("event") var event: Event? = Event(),
    @SerializedName("type") var type: String? = null,
    @SerializedName("event_id") var eventId: String? = null,
    @SerializedName("event_time") var eventTime: Int? = null,
    @SerializedName("authorizations") var authorizations: ArrayList<Authorizations> = arrayListOf(),
    @SerializedName("is_ext_shared_channel") var isExtSharedChannel: Boolean? = null,
    @SerializedName("event_context") var eventContext: String? = null
)