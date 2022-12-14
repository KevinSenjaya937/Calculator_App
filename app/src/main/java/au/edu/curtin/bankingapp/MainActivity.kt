package au.edu.curtin.bankingapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstNumber = findViewById<EditText>(R.id.firstNumberBox)
        val secondNumber = findViewById<EditText>(R.id.secondNumberBox)
        val resultNumber = findViewById<TextView>(R.id.resultBox)

        val addBtn = findViewById<Button>(R.id.addBtn)
        val subtractBtn = findViewById<Button>(R.id.subtractBtn)
        val multiplyBtn = findViewById<Button>(R.id.multiplyBtn)
        val divideBtn = findViewById<Button>(R.id.divideBtn)
        val clearBtn = findViewById<Button>(R.id.clearBtn)

        val errorNotification = findViewById<TextView>(R.id.errorNotification)

        fun errorChecker() {
            var errorText = ""
            val result = "Result"

            if (firstNumber.text.toString().isEmpty() && secondNumber.text.toString().isEmpty()) {
                errorText = "Please enter first and second number."
                resultNumber.text = result
            } else if (firstNumber.text.toString().isEmpty()) {
                errorText = "Please enter first number."
                resultNumber.text = result
            } else if (secondNumber.text.toString().isEmpty()) {
                errorText = "Please enter second number."
                resultNumber.text = result
            }
            errorNotification.text = errorText
        }

        addBtn.setOnClickListener {
            errorChecker()
            if (firstNumber.text.toString() != "" && secondNumber.text.toString() != "") {
                val first = firstNumber.text.toString().toDouble()
                val second = secondNumber.text.toString().toDouble()
                val result = "%.2f".format(first + second)
                resultNumber.text = result
            }
        }

        subtractBtn.setOnClickListener {
            errorChecker()
            if (firstNumber.text.toString() != "" && secondNumber.text.toString() != "") {
                val first = firstNumber.text.toString().toDouble()
                val second = secondNumber.text.toString().toDouble()
                val result = "%.2f".format(first - second)
                resultNumber.text = result
            }
        }

        multiplyBtn.setOnClickListener {
            errorChecker()
            if (firstNumber.text.toString() != "" && secondNumber.text.toString() != "") {
                val first = firstNumber.text.toString().toDouble()
                val second = secondNumber.text.toString().toDouble()
                val result = "%.2f".format(first * second)
                resultNumber.text = result
            }
        }

        divideBtn.setOnClickListener {
            errorChecker()
            if (firstNumber.text.toString() != "" && secondNumber.text.toString() != "") {
                val first = firstNumber.text.toString().toDouble()
                val second = secondNumber.text.toString().toDouble()
                val result = "%.2f".format(first / second)

                if (result == "NaN") {
                    val undefined = "Undefined"
                    resultNumber.text = undefined
                } else {
                    resultNumber.text = result
                }
            }
        }

        clearBtn.setOnClickListener {
            val result = "Result"
            resultNumber.text = result
            firstNumber.setText("")
            secondNumber.setText("")
            errorNotification.text = ""
        }
    }
}