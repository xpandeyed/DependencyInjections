package com.edpub.dependencyinjections

class UserRegistrationService(val userRepository: UserRepository, val emailService: EmailService) {

    fun registerUser(email: String, password: String){

    }

}