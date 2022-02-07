package app.takahashi.yonpachi.checkworkcount02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.takahashi.yonpachi.checkworkcount02.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater).apply {
            setContentView(this.root)
        }

        var number: Int = 0
        binding.numberText.text = number.toString()

        binding.plusButton.setOnClickListener {
            number += 1
            binding.numberText.text = number.toString()
        }
        binding.minusButton.setOnClickListener {
            number -= 1
            binding.numberText.text = number.toString()
        }
        binding.resetButton.setOnClickListener{
            number = 0
            binding.numberText.text = number.toString()
        }
    }
}