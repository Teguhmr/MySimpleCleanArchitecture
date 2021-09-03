package com.teguh.mysimplecleanarchitecture.data

import com.teguh.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}