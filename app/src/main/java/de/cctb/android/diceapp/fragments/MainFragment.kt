package de.cctb.android.diceapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.cctb.android.diceapp.R
import de.cctb.android.diceapp.databinding.MainFragmentBinding
import de.cctb.android.diceapp.viewmodels.MainViewModel
import kotlin.random.Random

class MainFragment : Fragment() {

    private var _binding: MainFragmentBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = MainFragmentBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnThrow.setOnClickListener {
            //https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.random/next-int.html
            binding.tvNumber.text = Random.nextInt(1,6).toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}