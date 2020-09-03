package com.example.petsbook.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.Navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.petsbook.R
import com.example.petsbook.data.OnBoardingRepository
import com.example.petsbook.data.OnBoardingRepository.registrationFinished
import kotlinx.android.synthetic.main.fragment_finish_sign_up.*

class FinishSignUpFragment : Fragment(R.layout.fragment_finish_sign_up) {

    var email: String? = null
    var password: String?= null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bSignUp.setOnClickListener {

            registrationFinished(requireContext())

//            // если человек ничего не выбрал, не переходить на след
//            email?:return@setOnClickListener
//            password?:return@setOnClickListener
//
//            OnBoardingRepository.setEmail(email!!)
//            OnBoardingRepository.setPassword(password!!)

          findNavController().navigate(R.id.profileFragment)
        }

    }



}