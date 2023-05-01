// Keep your First line Default

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonl: Button = findViewById(R.id.button7)
        val buttonr: Button = findViewById(R.id.button8)
        val buttona: Button = findViewById(R.id.button9)

        buttonl.setOnClickListener {
            val intent = Intent(this, LinearLayout::class.java)
            startActivity(intent)
        }
        buttonr.setOnClickListener {
            val intent = Intent(this, RelativeLayout::class.java)
            startActivity(intent)
        }
        buttona.setOnClickListener {
            val intent = Intent(this, AbsoluteLayout::class.java)
            startActivity(intent)
        }
    }
}
