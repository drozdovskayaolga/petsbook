package com.example.petsbook.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.petsbook.R
import kotlinx.android.synthetic.main.fragment_start_sign_up.*


class StartSignUpFragment : Fragment(R.layout.fragment_start_sign_up) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bStartSignUp.setOnClickListener {
            findNavController().navigate(R.id.choosePetFragment)
        }
    }



}