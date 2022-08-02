package au.edu.curtin.bankingapp

import android.os.Binder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var firstNumber = findViewById<EditText>(R.id.firstNumberBox)
        var secondNumber = findViewById<EditText>(R.id.secondNumberBox)
        var resultNumber = findViewById<EditText>(R.id.resultBox)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subtractBtn = findViewById<Button>(R.id.subtractBtn)
        val multiplyBtn = findViewById<Button>(R.id.multiplyBtn)
        val divideBtn = findViewById<Button>(R.id.divideBtn)


        addBtn.setOnClickListener {
            resultNumber.setText((firstNumber.text.toString().toDouble() + secondNumber.text.toString().toDouble()).toString())
        }

        subtractBtn.setOnClickListener {
            resultNumber.setText((firstNumber.text.toString().toDouble() - secondNumber.text.toString().toDouble()).toString())
        }

        multiplyBtn.setOnClickListener {
            resultNumber.setText((firstNumber.text.toString().toDouble() * secondNumber.text.toString().toDouble()).toString())
        }

        divideBtn.setOnClickListener {
            resultNumber.setText((firstNumber.text.toString().toDouble() / secondNumber.text.toString().toDouble()).toString())
        }

        // Rounding
        // Check Division by 0 stuff

    }
}