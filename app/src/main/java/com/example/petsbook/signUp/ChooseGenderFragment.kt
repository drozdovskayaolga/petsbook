package com.example.petsbook.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import com.example.petsbook.R
import com.example.petsbook.data.Gender
import com.example.petsbook.data.OnBoardingRepository
import kotlinx.android.synthetic.main.fragment_choose_gender.*

class ChooseGenderFragment: Fragment(R.layout.fragment_choose_gender) {

    var selectedGender:Gender? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bContinue3.setOnClickListener {

            // если человек ничего не выбрал, не переходить на след
            selectedGender?:return@setOnClickListener

            OnBoardingRepository.setGender(selectedGender!!)

            findNavController().navigate(R.id.chooseDOBFragment)
        }

        bFemale.setOnClickListener {
            selectedGender = Gender.FEMALE
            bFemale.setTextColor(ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark))
            bFemale.isSelected = true
            bMale.isSelected = false
        }

        bMale.setOnClickListener {
            selectedGender = Gender.MALE
            bMale.setTextColor(ContextCompat.getColor(requireContext(), R.color.colorPrimaryDark))
            bFemale.isSelected = false
            bMale.isSelected = true
        }
    }




}