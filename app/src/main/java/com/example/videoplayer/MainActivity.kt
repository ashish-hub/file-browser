package com.example.videoplayer

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.main_activity.*
import java.io.File

var data = mutableListOf<String>()
class MainActivity : AppCompatActivity() {
    private val tag = "Main Activity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE),3)
        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE),2)



        ///storage/emulated/0/Android/
        val per = File("/storage/emulated/0/").list()
        Toast.makeText(this,"${per.size}",Toast.LENGTH_LONG).show()

        for (i in 0 until per.size) {
            data.add(i, per[i])
        }









        button.setOnClickListener { startActivity(Intent(this, DisplayActivity::class.java)) }
    }
}
















/*
package com.example.videoplayer

import android.Manifest
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import java.io.File
//import java.Manifest

class MainActivity : AppCompatActivity() {
    private var write_permission = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.READ_EXTERNAL_STORAGE), 3)
        //ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE), 2)
        //if (Build.VERSION.SDK_INT >= 23) { checkSelfPermission(Manifest.permission.WRITE_EXTERNAL_STORAGE) }

    }

    */
/*override fun onStart() {
        super.onStart()

        //if (write_permission == true)
        Thread {
            //var path = File("/storage/emulated/").list()
            //path.byteInputStream().reader().encoding
            //Log.d("================","${path.size}")
            runOnUiThread {
                //findViewById<VideoView>(R.id.videoView).setVideoPath(path)
            }
        }.start()
    }*//*

}*/
