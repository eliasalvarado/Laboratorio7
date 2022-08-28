package com.example.laboratorio7

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.navigation.findNavController
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout


class fragment_principal : Fragment(R.layout.fragment_principal) {
    private lateinit var buttonLogin: Button
    private lateinit var buttonCreate: Button
    private  lateinit var correoIngresado: TextInputEditText

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        buttonLogin = view.findViewById(R.id.button_iniciar_sesion_framento_principal)
        buttonCreate = view.findViewById(R.id.button_registro_fragment_principal)
        correoIngresado = view.findViewById(R.id.text_input_correo_login)
        setListeners()
    }

    private fun setListeners() {

        buttonLogin.setOnClickListener{
            val action = fragment_principalDirections.actionFragmentPrincipalToFragmentHome(
                correo = correoIngresado.text.toString()
            )
            if (correoIngresado.text.toString() == "jcdurini@uvg.edu.gt") {
                requireView().findNavController().navigate(action)
            }
            else{

                Toast.makeText(this.activity, "El correo ingresado no existe.", Toast.LENGTH_LONG).show()
            }

        }
        buttonCreate.setOnClickListener {
            requireView().findNavController().navigate(R.id.action_fragment_principal_to_fragment_registro)
        }
    }

}