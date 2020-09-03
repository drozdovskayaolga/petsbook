package com.example.petsbook.signUp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petsbook.data.OnBoardingRepository
import com.example.petsbook.adapter.PetsListAdapter
import com.example.petsbook.R
import com.example.petsbook.data.PetsData
import kotlinx.android.synthetic.main.fragment_choose_pet.*


class ChoosePetFragment : Fragment(R.layout.fragment_choose_pet) {

    var selectedPet: PetsData? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bContinue1.setOnClickListener {

            // если человек ничего не выбрал, не переходить на след
            selectedPet?:return@setOnClickListener

            OnBoardingRepository.setPetId(selectedPet!!.petId)

            findNavController().navigate(R.id.chooseBreedFragment)
        }

        val adapter = PetsListAdapter(OnBoardingRepository.getPets())

        adapter.onItemClickListener = {
            // присваиваю переменной данные, полученные из адаптера
            selectedPet = it
        }

        rvPets.adapter = adapter
        rvPets.layoutManager = GridLayoutManager(requireContext(), 2)

    }




}
