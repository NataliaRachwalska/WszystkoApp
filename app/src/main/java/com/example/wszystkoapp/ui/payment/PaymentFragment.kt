package com.example.wszystkoapp.ui.payment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.wszystkoapp.R

class PaymentFragment :Fragment(){
        override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
        ): View {

            val root: View = inflater.inflate(R.layout.fragment_payment, container, false)


            return root
        }
    }
