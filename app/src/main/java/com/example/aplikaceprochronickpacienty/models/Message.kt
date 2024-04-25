package com.example.aplikaceprochronickpacienty.models

/** Citace datové třídy, která slouží k reprezentaci zpráv v aplikaci a umožňuje snadnou práci s daty zpráv.
    Třída byla převzata z tohoto zdroje.
    Zdroj: https://github.com/veeyaarVR/dialogflow_android_kotlin/blob/master/app/src/main/java/com/vignesh/chatbotkotlin/models/Message.kt **/
data class Message(
    var message: String,
    var isReceived: Boolean
)
