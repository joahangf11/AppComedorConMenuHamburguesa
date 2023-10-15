package mx.rmr.menuhamburguesaadmin.ui.view

import android.app.DatePickerDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import mx.rmr.menuhamburguesaadmin.databinding.FragmentRegistrarnuevousuarioBinding
import mx.rmr.menuhamburguesaadmin.ui.viewmodel.RegistrarNuevoUsuarioVM
import java.time.format.DateTimeParseException
import java.util.Calendar

class RegistrarNuevoUsuarioFragment : Fragment() {

    private var _binding: FragmentRegistrarnuevousuarioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    val selectedCalendar = Calendar.getInstance()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val registrarNuevoUsuarioVM =
            ViewModelProvider(this).get(RegistrarNuevoUsuarioVM::class.java)

        _binding = FragmentRegistrarnuevousuarioBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val etFecha = binding.etFecha
        etFecha.setOnClickListener { onClickScheduledDate(it) }


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    fun onClickScheduledDate(view: View) {
        val etScheduleDate = binding.etFecha

        val year = selectedCalendar.get(Calendar.YEAR)
        val month = selectedCalendar.get(Calendar.MONTH)
        val day = selectedCalendar.get(Calendar.DAY_OF_MONTH)
        val listener = DatePickerDialog.OnDateSetListener { _, y, m, d ->
            selectedCalendar.set(y,m,d)
            etScheduleDate.setText("$y-$m-$d")
        }
        DatePickerDialog(requireContext(),listener,year,month,day).show()
    }

}