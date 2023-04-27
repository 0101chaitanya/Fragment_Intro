package com.hfad.fragmentintro

import android.graphics.Typeface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment

class StyleFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_style, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val boldButton = view.findViewById<Button>(R.id.bold_button)
        val italicButton = view.findViewById<Button>(R.id.italic_button)
        val resetButton = view.findViewById<Button>(R.id.reset_button)
        val helloWorldTextView = view.findViewById<TextView>(R.id.hello_world)
        boldButton.setOnClickListener {
            if (helloWorldTextView.typeface?.isItalic == true) {
                helloWorldTextView.setTypeface(/* tf = */ helloWorldTextView.typeface, /* style = */
                    Typeface.BOLD_ITALIC
                )
            } else {
                helloWorldTextView.setTypeface(null, Typeface.BOLD)
            }

        }
        italicButton.setOnClickListener {
            if (helloWorldTextView.typeface?.isBold == true) {
                helloWorldTextView.setTypeface(helloWorldTextView.typeface, Typeface.BOLD_ITALIC)
            } else {
                helloWorldTextView.setTypeface(null, Typeface.ITALIC)
            }
        }
        resetButton.setOnClickListener {
            helloWorldTextView.setTypeface(null, Typeface.NORMAL)
        }
    }

    companion object
}