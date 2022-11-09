package `in`.riyasinha.ratemyburger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var ratingBar: RatingBar = findViewById(R.id.ratingBar)
        val button: Button = findViewById(R.id.appCompatButton)
        var text: TextView = findViewById(R.id.textView)
        button.setOnClickListener() {
            var ratingvalue = ratingBar.rating

            when (ratingvalue) {
                in 0.1..1.0 -> text.setText("Rating Value = $ratingvalue \nWe will try better next time")
                in 1.1..2.0 -> text.setText("Rating Value = $ratingvalue \nWe are constantly improving")
                in 2.1..3.0 -> text.setText("Rating Value = $ratingvalue \nThank You! \nHow can we improve us?")
                in 3.1..4.0 -> text.setText("Rating Value = $ratingvalue \nThank You! \nHow can we improve us?")
                in 4.1..5.0 -> text.setText("Rating Value = $ratingvalue \nThank You! \nWe appreciate it.")
            }

        }
    }
}
