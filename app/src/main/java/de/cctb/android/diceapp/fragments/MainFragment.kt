package de.cctb.android.diceapp.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
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

    private val viewModel: MainViewModel by activityViewModels()

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
        binding.tvNumber.text = viewModel.currentNumber.toString()

        // On button click throw dice and show the new value
        binding.btnThrow.setOnClickListener {
            viewModel.throwDice()
            binding.tvNumber.text = viewModel.currentNumber.toString()
        }

        // On button click move to history fragment
        binding.btnHistory.setOnClickListener {
            view.findNavController().navigate(R.id.action_mainFragment_to_historyFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}