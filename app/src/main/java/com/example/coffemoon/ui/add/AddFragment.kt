package com.example.coffemoon.ui.add

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import com.example.coffemoon.R
import com.example.coffemoon.databinding.ActivityMainBinding
import com.example.coffemoon.databinding.FragmentAddBinding

class AddFragment : Fragment() {

    companion object {
        fun newInstance() = AddFragment()
    }

    private lateinit var viewModel: AddViewModel

    private lateinit var binding: FragmentAddBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // buscar inflate para dropdown
        binding = FragmentAddBinding.inflate(inflater, container, false)

        val items = listOf("Café", "Té","Bebida",  "Pan", "Queque")
        //val items = resources.getStringArray(R.array.array_list)
        val adapter = ArrayAdapter(requireContext(), R.layout.list_item, items)
        (binding.selectCategory.editText as? AutoCompleteTextView)?.setAdapter(adapter)
        //binding.autoCompleteTextView.setAdapter(adapter)
        return (binding.root)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(AddViewModel::class.java)

        // TODO: Use the ViewModel
    }

}