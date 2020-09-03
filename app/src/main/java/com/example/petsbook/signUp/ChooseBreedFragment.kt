package com.example.petsbook.signUp

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.petsbook.R
import com.example.petsbook.adapter.BreedsListAdapter
import com.example.petsbook.data.BreedsData
import com.example.petsbook.data.OnBoardingRepository
import com.example.petsbook.data.PetsData
import kotlinx.android.synthetic.main.fragment_choose_breed.*


class ChooseBreedFragment : Fragment(R.layout.fragment_choose_breed) {

    var selectedBreed: BreedsData? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bContinue2.setOnClickListener {

            // если человек ничего не выбрал, не переходить на след
            selectedBreed?:return@setOnClickListener

            OnBoardingRepository.setBreedId(selectedBreed!!.breedId)

            findNavController().navigate(R.id.chooseGenderFragment)
        }

        // достаю айди животного, которое выбрал юзер, чтобы показать соответствующую породу
        val petId = OnBoardingRepository.user.petId!!

        val adapter = BreedsListAdapter(OnBoardingRepository.getBreeds(petId))

        adapter.onItemClickListener = {
            // присваиваю переменной данные, полученные из адаптера
            selectedBreed = it
        }

        rvBreeds.adapter = adapter
        rvBreeds.layoutManager = GridLayoutManager(requireContext(), 2)
    }


}