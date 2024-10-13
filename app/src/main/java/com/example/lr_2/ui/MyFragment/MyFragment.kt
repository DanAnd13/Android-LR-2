package com.example.lr_2.ui.MyFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.lr_2.R
import com.example.lr_2.databinding.MyFragmentBinding

class MyFragment : Fragment() {
    private var _binding : MyFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val myViewModel = ViewModelProvider(this).get(MyFragmentViewModel::class.java)
         _binding = MyFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView : TextView = binding.myFragment
        myViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}