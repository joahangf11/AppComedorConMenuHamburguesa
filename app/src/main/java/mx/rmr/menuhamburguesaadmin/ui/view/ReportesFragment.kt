package mx.rmr.menuhamburguesaadmin.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.navigation.fragment.findNavController
import mx.rmr.menuhamburguesaadmin.R
import mx.rmr.menuhamburguesaadmin.databinding.FragmentReportesBinding

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
        registrarSpinners()
        //registrarObservables()
    }

    private fun registrarSpinners() {
        // Spinner tipo reporte
        val spinnerTipoReporte = requireView().findViewById<Spinner>(R.id.spinnerTipoReportes)
        val opcionesTipoReporte = arrayOf(
            "Reporte de seguridad",
            "Reporte de salud e higiene",
            "Reporte de incidentes",
            "Reporte de mantenimiento"
        )
        val adaptadorTipoReporte= ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, opcionesTipoReporte)
        spinnerTipoReporte.adapter = adaptadorTipoReporte

        // Spinner urgencia
        val spinnerUrgencia = requireView().findViewById<Spinner>(R.id.spinnerUrgencia)
        val opcionesUrgencia = arrayOf(
            "Inmediato",
            "Menos de 30",
            "Menos de 2 horas",
            "Antes de 24 horas",
            "Antes de 72 horas",
            "Sin rango de asignado"
        )
        val adaptadorUrgencia= ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, opcionesUrgencia)
        spinnerUrgencia.adapter = adaptadorUrgencia
    }

    private fun registrarEventos() {
        binding.btnAyuda.setOnClickListener() {
            findNavController().navigate(R.id.action_nav_reportes_to_ayudaReporteFragment)
        }
    }

}