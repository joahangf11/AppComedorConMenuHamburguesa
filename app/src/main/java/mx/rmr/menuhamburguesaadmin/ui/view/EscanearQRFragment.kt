package mx.rmr.menuhamburguesaadmin.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import mx.rmr.menuhamburguesaadmin.R
import mx.rmr.menuhamburguesaadmin.databinding.FragmentEscanearqrBinding
import mx.rmr.menuhamburguesaadmin.ui.viewmodel.EscanearQRVM

class EscanearQRFragment : Fragment() {

    private var _binding:FragmentEscanearqrBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val escanearQRVM =
            ViewModelProvider(this).get(EscanearQRVM::class.java)

        _binding = FragmentEscanearqrBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registrarEventos()
        //registrarObservables()
    }

    // Registra los eventos
    private fun registrarEventos() {

        // Evento de cuando el usuario da clic en el botón del mapa
        binding.btnEscanear.setOnClickListener{
            findNavController().navigate(R.id.action_nav_escanearqr_to_infoAsistenteFragment)
        }
        binding.btnEscaneaManual.setOnClickListener{
            findNavController().navigate(R.id.action_nav_escanearqr_to_infoAsistenteFragment)
        }
    }
}