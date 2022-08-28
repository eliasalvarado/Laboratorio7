package com.example.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import com.google.android.material.textfield.TextInputLayout


class FragmentHome : Fragment(R.layout.fragment_home) {
    private lateinit var buttonActualizar: Button
    private  lateinit var mensaje: TextView

    private val args: FragmentHomeArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonActualizar = view.findViewById(R.id.button_actualizarperfil_fragment_home)
        mensaje = view.findViewById(R.id.mensaje_fragment_home)

        mensaje.text = "Hola ${args.correo.toString()}, necesitamos que actualices tu perfil!"

        setListeners()
    }

    private fun setListeners() {
        buttonActualizar.setOnClickListener()
        {
            val action = FragmentHomeDirections.actionFragmentHomeToFragmentPerfil(
                correo = args.correo
            )
            requireView().findNavController().navigate(action)
        }
    }


}