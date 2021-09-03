package com.teguh.mysimplecleanarchitecture.di

import com.teguh.mysimplecleanarchitecture.data.IMessageDataSource
import com.teguh.mysimplecleanarchitecture.data.MessageDataSource
import com.teguh.mysimplecleanarchitecture.data.MessageRepository
import com.teguh.mysimplecleanarchitecture.domain.IMessageRepository
import com.teguh.mysimplecleanarchitecture.domain.MessageInteractor
import com.teguh.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}