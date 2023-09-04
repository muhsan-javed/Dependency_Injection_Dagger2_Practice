package com.muhsanjaved.daggerpractice

import javax.inject.Inject

class UserRegistrationService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun registerUser(email: String, password:String){
        userRepository.saveUser(email,password)
        emailService.send(email, "no-reply@muhsantech.com","User Registered")
    }
}

/*
*   Unit Testing
*   Single Responsibility
*   Lifetime of these Objects
*   Extensible
*/