package mx.rmr.menuhamburguesaadmin.ui.calificaciones

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.rmr.menuhamburguesaadmin.databinding.FragmentCalificacionesBinding

class CalificacionesFragment : Fragment() {

    private var _binding: FragmentCalificacionesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val calificacionesVM =
            ViewModelProvider(this).get(CalificacionesVM::class.java)

        _binding = FragmentCalificacionesBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.text
//        calificacionesVM.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}