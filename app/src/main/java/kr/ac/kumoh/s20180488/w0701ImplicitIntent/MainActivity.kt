package kr.ac.kumoh.s20180488.w0701ImplicitIntent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.ActivityChooserView
import kr.ac.kumoh.s20180488.w0701ImplicitIntent.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnHomepage.setOnClickListener{
            val uri = Uri.parse("https://github.com/bearwithpy")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnMap.setOnClickListener{
            val uri = Uri.parse("geo:0,0?z=17q=경남 거제시 일운면 소동8길 11")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
        binding.btnTelephone.setOnClickListener{
            val uri = Uri.parse("tel:010-7197-3338")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }
}