package demos

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import demos.databinding.ActivityMainBinding

fun updateText(editText: EditText): TextWatcher {
    return object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
            // Don't set text to same content to avoid infinite triggering
            if (editText.text.toString() != s.toString()) {
                editText.text = s
            }
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
    }
}

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textField1.addTextChangedListener(updateText(binding.textField2))
        binding.textField2.addTextChangedListener(updateText(binding.textField1))
    }

}
