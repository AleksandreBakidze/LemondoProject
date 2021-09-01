package com.example.lemondohomework.fragments

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import com.example.lemondohomework.R
import com.example.lemondohomework.databinding.FragmentLogicOneBinding
import com.example.lemondohomework.databinding.FragmentLogicTwoBinding

class LogicTwoFragment : Fragment() {
    private var _binding: FragmentLogicTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLogicTwoBinding.inflate(inflater, container, false)

        binding.btnLogicTwoGenerator.setOnClickListener {
            val symbols = "23456789/?!:;%"
            if (binding.logicTwoGetTextEt.text.any {it in symbols}){
                Toast.makeText(activity, "Enter only 0's or/and 1's", Toast.LENGTH_SHORT).show()
            }else{

                when{
                    TextUtils.isEmpty(binding.logicTwoGetTextEt.text.toString().trim{it <= ' '}) ->{
                        Toast.makeText(activity, "Enter 0's or/and 1's", Toast.LENGTH_SHORT).show()
                    }
                    else ->{

                        var numbers : String = binding.logicTwoGetTextEt.text.toString()

                        if (numbers.contains("1111111") || numbers.contains("0000000")){
                            Toast.makeText(activity, "YES", Toast.LENGTH_SHORT).show()
                        }else{
                            Toast.makeText(activity, "NO", Toast.LENGTH_SHORT).show()
                        }

                    }
                }

            }
        }

        return binding.root
    }
}