package com.example.petsbook.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.findNavController
import com.example.petsbook.R
import com.example.petsbook.data.OnBoardingRepository
import kotlinx.android.synthetic.main.fragment_indicate_pets_name.*

class IndicatePetsNameFragment : Fragment(R.layout.fragment_indicate_pets_name) {

    var name: String? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bContinue5.setOnClickListener {

            if (etName.getText().toString().equals("")) {

                return@setOnClickListener

            } else {

//                OnBoardingRepository.setPetsName(name!!)

                findNavController().navigate(R.id.finishSignUpFragment)
            }
        }


    }




}