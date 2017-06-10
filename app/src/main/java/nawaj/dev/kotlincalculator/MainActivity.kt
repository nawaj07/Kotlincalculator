package nawaj.dev.kotlincalculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    fun sum2number(a: Int, b: Int):Int {
    return a+b
    }

    fun sub2number(a: Int, b: Int):Int {
        return a-b
    }

    fun mul2number(a: Int, b: Int):Int {
        return a*b
    }

    fun div2number(a: Float, b: Float):Float {
        if(b!=0f)
        return a/b
        else
            return 0f
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsum.setOnClickListener {
            Toast.makeText(this,""+sum2number(edttxt1.text.toString().toInt(),edttxt2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
       btnsub.setOnClickListener {
            Toast.makeText(this,""+sub2number(edttxt1.text.toString().toInt(),edttxt2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        btnmul.setOnClickListener {
            Toast.makeText(this,""+mul2number(edttxt1.text.toString().toInt(),edttxt2.text.toString().toInt()),Toast.LENGTH_SHORT).show()
        }
        btndiv.setOnClickListener {
            Toast.makeText(this,""+div2number(edttxt1.text.toString().toFloat(),edttxt2.text.toString().toFloat()),Toast.LENGTH_SHORT).show()
        }
       }
}
