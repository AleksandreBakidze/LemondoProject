package com.example.lemondohomework.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.lemondohomework.databinding.FragmentDesignOneBinding

class DesignOneFragment : Fragment() {
    private var _binding: FragmentDesignOneBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDesignOneBinding.inflate(inflater, container, false)

        //Click Row 1
        binding.row1Cv.setOnClickListener {
            Toast.makeText(activity, "Row 1 Clicked", Toast.LENGTH_SHORT).show()
        }

        //Click Row 2
        binding.row2Cv.setOnClickListener {
            Toast.makeText(activity, "Row 2 Clicked", Toast.LENGTH_SHORT).show()
        }

        //Click Row 3
        binding.row3Cv.setOnClickListener {
            Toast.makeText(activity, "Row 3 Clicked", Toast.LENGTH_SHORT).show()
        }

        return binding.root
    }
}