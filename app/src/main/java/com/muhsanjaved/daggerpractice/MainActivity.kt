package com.muhsanjaved.daggerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.Component
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var userRegistrationService:UserRegistrationService
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val userRepository = UserRepository()
//        val emailService = EmailService()


//        val userRegistrationService = UserRegistrationService(userRepository,emailService)

//        val userRegistrationService = DaggerUserRegistrationComponent.builer().build.getUserRegistrationService()

//        val component = DaggerUserRegistrationComponent.builder.build()

        val component = DaggerUserR.builder().build
        userRegistrationService.registerUser("muhsantech048@gmail.com","111111")
    }
}

@Component
interface UserRegistrationComponent {
    fun getUserRegistrationService() : UserRegistrationService
}
