package com.hfad.fragmentintro

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_counter, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val counter = view.findViewById<TextView>(R.id.counter)
        view.findViewById<Button>(R.id.plus).setOnClickListener {
            var counterValue = counter.text.toString().toInt()
            counter.text = (++counterValue).toString()
        }
        view.findViewById<Button>(R.id.minus).setOnClickListener {
            var counterValue = counter.text.toString().toInt()
            if (counterValue > 0) {
                counter.text = (--counterValue).toString()
            }
        }
    }

    companion object
}