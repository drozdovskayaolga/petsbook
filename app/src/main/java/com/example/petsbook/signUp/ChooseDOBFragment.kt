package com.example.petsbook.signUp

import android.app.DatePickerDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import androidx.navigation.fragment.findNavController
import com.example.petsbook.R
import com.example.petsbook.data.OnBoardingRepository
import kotlinx.android.synthetic.main.fragment_choose_dob.*
import org.threeten.bp.LocalDate
import org.threeten.bp.format.DateTimeFormatter
import java.text.SimpleDateFormat
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class ChooseDOBFragment : Fragment(R.layout.fragment_choose_dob) {

    var buttonDate: Button? = null
    var textViewDate: TextView? = null
    var dob: LocalDate? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        bContinue4.setOnClickListener {

            // если человек ничего не выбрал, не переходить на след
            dob?:return@setOnClickListener

            OnBoardingRepository.setDOB(dob!!)

            findNavController().navigate(R.id.indicatePetsNameFragment)
        }


        // get the references from layout file
        textViewDate = this.tvDate
        buttonDate = this.bDate

        tvDate!!.text = ""

        // create an OnDateSetListener
        val dateSetListener =
            DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->
                dob = LocalDate.of(year,monthOfYear+1,dayOfMonth)
                updateDateInView()
            }

        val now = LocalDate.now()
        val year = dob?.year?:now.year
        val month = dob?.monthValue?:now.monthValue
        val day = dob?.dayOfMonth?:now.dayOfMonth

        // when you click on the button, show DatePickerDialog that is set with OnDateSetListener
        buttonDate!!.setOnClickListener {
            DatePickerDialog(
                requireContext(),
                dateSetListener,
                // set DatePickerDialog to point to today's date when it loads up
                year,
                month-1,
                day ).show()
        }
    }

    private fun updateDateInView() {
        val myFormat = "dd/MM/yyyy" // mention the format you need
        textViewDate!!.text =  dob!!.format(DateTimeFormatter.ofPattern(myFormat))
    }

}