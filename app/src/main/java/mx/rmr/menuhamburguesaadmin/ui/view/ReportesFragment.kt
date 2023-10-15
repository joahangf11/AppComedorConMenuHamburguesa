package mx.rmr.menuhamburguesaadmin.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import mx.rmr.menuhamburguesaadmin.R
import mx.rmr.menuhamburguesaadmin.databinding.FragmentReportesBinding
import mx.rmr.menuhamburguesaadmin.ui.viewmodel.ReportesVM

class ReportesFragment : Fragment() {

    private lateinit var binding: FragmentReportesBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentReportesBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        registrarEventos()
        //registrarObservables()
    }

    private fun registrarEventos() {
        binding.btnAyuda.setOnClickListener() {
            findNavController().navigate(R.id.action_nav_reportes_to_ayudaReporteFragment)
        }
    }

}