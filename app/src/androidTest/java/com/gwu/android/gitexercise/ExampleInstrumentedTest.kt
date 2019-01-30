package com.example.helloworld

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // you do not need to specify the variable type
        //vals are like finals in java (can't reassign)
        val string: String = "hello world"
        // string = "new stuff" // does not work
        // vars can be assigned
        var string2: String? = "creating variables"
        string2 = "new stuff"
        string2 = null

        if(string2 != null){
            val length = string2.length
        }

        private fun getStringLength(string: String?): Int{
           // . calls the method only if the string is not null otherwise
            return string?.length  ?:0 //this is to return null if the string is not null, otherwise return 0

            // same as above code
            if(string !=null){
                return string.length
            }
            return 0
        }
    }
}
