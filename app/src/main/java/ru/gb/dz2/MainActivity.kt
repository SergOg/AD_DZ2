package ru.gb.dz2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ru.gb.dz2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.textView1.text = "верхняя строчка, настроенная из кода"
//        binding.textView2.text = "нижняя строчка, настроенная из кода"
        binding.block2.setTopText("верхняя строчка, настроенная из кода")
        binding.block2.setBottomText("нижняя строчка, настроенная из кода")
    }
}