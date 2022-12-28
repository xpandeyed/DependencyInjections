package com.edpub.dependencyinjections

import javax.inject.Inject

class UserRegistrationService @Inject constructor (private val userRepository: UserRepository, private val emailService: EmailService)
{
    fun registerUser(email: String, password: String){

    }

}