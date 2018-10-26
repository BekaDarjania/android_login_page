package com.example.beka.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        init()
    }

    private fun init (){
        // set up on click listeners

        login_button.setOnClickListener {


            var mail = emailField.text.toString()
            var pwd1 = passwordField1.text.toString()
            var pwd2 = passwordField2.text.toString()

            if(mail.isEmpty() || pwd1.isEmpty() || pwd2.isEmpty())
            {
                var message = Toast.makeText(applicationContext,"Something is missing",Toast.LENGTH_LONG)
                message.show()
            }
            else{
                // check if there is @gmail.com in email string
                if(!mail.contains("@gmail.com")) {
                    // the email was not valid
                    var message = Toast.makeText(applicationContext,"Email is invalid",Toast.LENGTH_LONG)
                    message.show()
                }
                else{
                    // the amail was VALID
                    //continue
                    // check password match
                    if(!pwd1.equals(pwd2)){
                        // passwords don't match
                        var message = Toast.makeText(applicationContext,"passwords don't match",Toast.LENGTH_LONG)
                        message.show()

                    }else {
                        // passwords match
                        // login was successful
                        var message = Toast.makeText(applicationContext,"Success",Toast.LENGTH_LONG)
                        message.show()
                    }
                }
            }
        }
    }
}