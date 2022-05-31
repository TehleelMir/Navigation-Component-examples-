package com.example.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navigationcomponent.databinding.FragmentHomeBinding
import com.example.navigationcomponent.databinding.FragmentLoginBinding
import com.example.navigationcomponent.databinding.FragmentWelcomeBinding

class WelcomeFragment: Fragment() {
    private lateinit var binding: FragmentWelcomeBinding
    private val args: WelcomeFragmentArgs by navArgs()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWelcomeBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        init()
    }

    private fun init() {
        binding.apply {
            textViewName.text = args.userName
            textViewPassword.text = args.password
        }

        binding.button.setOnClickListener {
            val action = WelcomeFragmentDirections.actionWelcomeFragmentToHomeFragment()
            findNavController().navigate(action)
        }
    }
}