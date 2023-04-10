// Keep Your Package Same (Keep this line default)  -- Don't Change Line 1

import android.os.Bundle
import android.telephony.SmsManager
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var phoneEdt: EditText
    lateinit var messageEdt: EditText
    lateinit var sendMsgBtn: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        phoneEdt = findViewById(R.id.phoneEdt)
        messageEdt = findViewById(R.id.messageEdt)
        sendMsgBtn = findViewById(R.id.sendMsgBtn)

        sendMsgBtn.setOnClickListener {
            val smsManager = SmsManager.getDefault()
            smsManager.sendTextMessage(phoneEdt.text.toString(), null, messageEdt.text.toString(), null, null) }

}}
