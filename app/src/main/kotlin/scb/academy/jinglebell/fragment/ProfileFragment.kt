package scb.academy.jinglebell.fragment

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_profile.*
import scb.academy.jinglebell.R
import scb.academy.jinglebell.activity.HelloActivity

class ProfileFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setView()
    }

    private fun setView() {
        btnAdd.setOnClickListener {
            var name = inputName.text.toString()

            context?.let { it1 -> HelloActivity.startActivity(it1, name) }
        }
    }
}