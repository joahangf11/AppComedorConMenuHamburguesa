package mx.rmr.menuhamburguesaadmin.ui.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import mx.rmr.menuhamburguesaadmin.ui.viewmodel.InfoAsistenteVM
import mx.rmr.menuhamburguesaadmin.R

class InfoAsistenteFragment : Fragment() {

    companion object {
        fun newInstance() = InfoAsistenteFragment()
    }

    private lateinit var viewModel: InfoAsistenteVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_info_asistente, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(InfoAsistenteVM::class.java)
        // TODO: Use the ViewModel
    }

}