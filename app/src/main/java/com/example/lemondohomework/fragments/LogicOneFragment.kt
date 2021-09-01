package com.example.lemondohomework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lemondohomework.R
import com.example.lemondohomework.databinding.FragmentDesignTwoBinding
import com.example.lemondohomework.databinding.FragmentLogicOneBinding

class LogicOneFragment : Fragment() {
    private var _binding: FragmentLogicOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLogicOneBinding.inflate(inflater, container, false)

        binding.btnLogicOneGenerator.setOnClickListener {
            function()
        }

        return binding.root
    }

    fun function(){

        var n = binding.rectangleNEt.text.toString().toInt()
        var m = binding.rectangleMEt.text.toString().toInt()
        var a = binding.squareAEt.text.toString().toInt()
        var answer: Int = 0

        if (a >= m && a >= n){
            answer = 1
        }else {
            // vertical number of squares
            var x: Int

            //horizontal number of squares
            var y: Int

            x = m/a
            y = n/a

            if (m%a !=0){
                x++
            }
            if (n%a != 0){
                y++
            }
            answer = x * y
        }
        answer.toString()
        binding.generatedNumberTv.text = "$answer"
    }
}