package mx.rmr.menuhamburguesaadmin.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import mx.rmr.menuhamburguesaadmin.databinding.FragmentRegistrarnuevousuarioBinding
import mx.rmr.menuhamburguesaadmin.ui.viewmodel.RegistrarNuevoUsuarioVM

class RegistrarNuevoUsuarioFragment : Fragment() {

    private var _binding: FragmentRegistrarnuevousuarioBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val registrarNuevoUsuarioVM =
            ViewModelProvider(this).get(RegistrarNuevoUsuarioVM::class.java)

        _binding = FragmentRegistrarnuevousuarioBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: TextView = binding.textSlideshow
//        registrarNuevoUsuarioVM.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}