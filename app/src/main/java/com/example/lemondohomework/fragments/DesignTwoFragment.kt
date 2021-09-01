package com.example.lemondohomework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lemondohomework.R
import com.example.lemondohomework.databinding.FragmentDesignOneBinding
import com.example.lemondohomework.databinding.FragmentDesignTwoBinding

class DesignTwoFragment : Fragment() {
    private var _binding: FragmentDesignTwoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDesignTwoBinding.inflate(inflater, container, false)

        //Second Click Row 1
        binding.secondRow1Cv.setOnClickListener {
            Toast.makeText(activity, "Row 1 Clicked", Toast.LENGTH_SHORT).show()
        }

        //Second Click Row 2
        binding.secondRow2Cv.setOnClickListener {
            Toast.makeText(activity, "Row 2 Clicked", Toast.LENGTH_SHORT).show()
        }

        //Second Click Row 3
        binding.secondRow3Cv.setOnClickListener {
            Toast.makeText(activity, "Row 3 Clicked", Toast.LENGTH_SHORT).show()
        }

        //Second Click Row 4
        binding.secondRow4Cv.setOnClickListener {
            Toast.makeText(activity, "Row 4 Clicked", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}