package com.example.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText


class fragment_registro : Fragment(R.layout.fragment_registro) {
    private lateinit var buttonCreate: Button
    private  lateinit var correoRegistro: TextInputEditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonCreate = view.findViewById(R.id.button_crear_cuenta_fragment_registro)
        correoRegistro = view.findViewById(R.id.text_input_correo_registro)
        setListeners()
    }

    private fun setListeners() {
        buttonCreate.setOnClickListener {
            val action = fragment_registroDirections.actionFragmentRegistroToFragmentHome(
                correo = correoRegistro.text.toString()
            )
            requireView().findNavController().navigate(action)
        }
    }
}