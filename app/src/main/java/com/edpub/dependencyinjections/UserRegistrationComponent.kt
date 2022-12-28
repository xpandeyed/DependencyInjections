package com.edpub.dependencyinjections

import dagger.Component

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService():UserRegistrationService
    fun getEmailService(): EmailService
}