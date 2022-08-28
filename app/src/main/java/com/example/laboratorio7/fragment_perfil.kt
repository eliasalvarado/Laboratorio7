package com.example.laboratorio7

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class fragment_perfil : Fragment(R.layout.fragment_perfil) {
    private lateinit var buttonActualizar: Button
    private lateinit var inputCorreo: TextInputLayout

    private val args: fragment_perfilArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        inputCorreo = view.findViewById(R.id.text_inputLayout_correo_perfil)
        buttonActualizar = view.findViewById(R.id.button_actualizar_miperfil)

        inputCorreo.hint = args.correo.toString()

        setListeners()
    }

    private fun setListeners() {
        buttonActualizar.setOnClickListener {
            val action = fragment_perfilDirections.actionFragmentPerfilToFragmentPrincipal()
            requireView().findNavController().navigate(action)
        }
    }

}