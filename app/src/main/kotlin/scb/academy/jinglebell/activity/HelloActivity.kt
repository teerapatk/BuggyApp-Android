package scb.academy.jinglebell.activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.hello_activity.*
import scb.academy.jinglebell.R

class HelloActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_KEY_MODEL = "MODEL"
        fun startActivity(context: Context?, name: String) =
            context?.startActivity(
                Intent(context, HelloActivity::class.java).also { myIntent ->
                    myIntent.putExtra(EXTRA_KEY_MODEL, name)
                })
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.hello_activity)
        val name: String? = intent.getStringExtra(EXTRA_KEY_MODEL)
        tvName.text = name
    }
}
