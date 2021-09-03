package com.teguh.mysimplecleanarchitecture.data

import com.teguh.mysimplecleanarchitecture.domain.IMessageRepository
import com.teguh.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource): IMessageRepository {
    override fun getWelcomeMessage(name: String) =
        messageDataSource.getMessageFromSource(name)
}