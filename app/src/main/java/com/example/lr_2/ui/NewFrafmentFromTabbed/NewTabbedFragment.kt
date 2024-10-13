package com.example.lr_2.ui.NewFrafmentFromTabbed

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.lr_2.MainActivity
import com.example.lr_2.R
import com.example.lr_2.TabbedActivity
import com.example.lr_2.databinding.MyFragmentBinding
import com.example.lr_2.databinding.NewTabbedFragmentBinding
import com.example.lr_2.ui.MyFragment.MyFragmentViewModel

class NewTabbedFragment : Fragment() {
    private var _binding : NewTabbedFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val newTabbedViewModel = ViewModelProvider(this).get(NewTabbedFragmentViewModel::class.java)
        _binding = NewTabbedFragmentBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val textView : TextView = binding.titleOnTabbedActivity
        newTabbedViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it

            binding.goToMainActivity.setOnClickListener {
                val intent = Intent(activity, MainActivity::class.java)
                startActivity(intent)
            }
        }

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}