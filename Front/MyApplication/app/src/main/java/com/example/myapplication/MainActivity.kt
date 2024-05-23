package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONArray
import org.json.JSONException

class MainActivity : AppCompatActivity() {
    private var textView: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById<TextView>(R.id.textView)
        fetchData()
    }

    private fun fetchData() {
        val url = "http://127.0.0.1:8080/sensordataForAPP" // 10.0.2.2는 에뮬레이터에서 로컬호스트를 참조하는 주소
        val queue = Volley.newRequestQueue(this)
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                try {
                    val jsonArray = JSONArray(response)
                    val sb = StringBuilder()
                    for (i in 0 until jsonArray.length()) {
                        val jsonObject = jsonArray.getJSONObject(i)
                        val sensorName = jsonObject.getString("sensorName")
                        val value = jsonObject.getString("value")
                        sb.append("Sensor: ").append(sensorName).append(", Value: ").append(value)
                            .append("\n")
                    }
                    textView!!.text = sb.toString()
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            }
        ) { error -> textView!!.text = "Error: $error" }
        queue.add(stringRequest)
    }
}