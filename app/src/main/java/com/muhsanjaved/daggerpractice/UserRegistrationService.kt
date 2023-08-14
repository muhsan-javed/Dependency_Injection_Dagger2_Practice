package com.muhsanjaved.daggerpractice

class UserRegistrationService {

    private val userRepository = UserRepository()
    private val emailService = EmailService()

    fun registerUser(email: String, password:String){
        userRepository.saveUser(email)
        emailService.send(email, "no-reply@muhsantech.com","User Registered")
    }
}

/*
*   Unit Testing
*   Single Responsibility
*   Lifetime of these Objects
*   Extensible
*/