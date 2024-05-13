package com.example.wszystkoapp.ui.send

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.wszystkoapp.R
import androidx.navigation.fragment.findNavController

class Send : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root: View = inflater.inflate(R.layout.fragment_send, container, false)
        val radioGroup = root.findViewById<RadioGroup>(R.id.radio_group)
        val buttonPayment = root.findViewById<Button>(R.id.button_payment)
        radioGroup.setOnCheckedChangeListener { group, checkedId ->
            val checkedRadioButton = root.findViewById<RadioButton>(checkedId)
            val checkedText = checkedRadioButton.text.toString()
            Toast.makeText(requireContext(), "Selected radio button: $checkedText", Toast.LENGTH_SHORT).show()
        }
        buttonPayment.setOnClickListener {
            // Navigate to the fragment_payment
            findNavController().navigate(R.id.nav_payment)
        }
        return root
    }
}




