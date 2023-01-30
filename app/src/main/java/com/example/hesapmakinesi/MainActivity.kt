package com.example.hesapmakinesi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnsayitik(view: View){
        var btnsec = view as Button
        var btntikdeger:String = sayiGoster.text.toString()

        when(btnsec.id){
            btn0.id->{
                btntikdeger+="0"
            }

            btn1.id->{
                btntikdeger+="1"
            }

            btn2.id->{
                btntikdeger+="2"
            }

            btn3.id->{
                btntikdeger+="3"
            }

            btn4.id->{
                btntikdeger+="4"
            }

            btn5.id->{
                btntikdeger+="5"
            }

            btn6.id->{
                btntikdeger+="6"
            }

            btn7.id->{
                btntikdeger+="7"
            }

            btn8.id->{
                btntikdeger+="8"
            }

            btn9.id->{
                btntikdeger+="9"
            }

            btnmutlak.id->{
                btntikdeger+="-"+btntikdeger
            }
        }
        sayiGoster.setText(btntikdeger)
    }

    var opt = "*"
    var eskisayi=""
    var yeniotp=true

    fun btnoptik(view:View){
        var btnsec = view as Button
        when(btnsec.id){
            btnbol.id->{
                opt="/"
            }

            btntop.id->{
                opt="+"
            }

            btneksi.id->{
                opt="-"
            }

            btncarpma.id->{
                opt="*"
            }
        }
        eskisayi=sayiGoster.text.toString()
        yeniotp=true
    }

    fun btnesittik(view:View){
        if(yeniotp){
            sayiGoster.setText("")
        }
        yeniotp=false
        var yenisayi = sayiGoster.text.toString()
        var sonucsayisi:Double?=null
        when(opt){
            "/"->{
                sonucsayisi=eskisayi.toDouble()/yenisayi.toDouble()
            }

            "*"->{
                sonucsayisi=eskisayi.toDouble()*yenisayi.toDouble()
            }

            "+"->{
                sonucsayisi=eskisayi.toDouble()+yenisayi.toDouble()
            }

            "-"->{
                sonucsayisi=eskisayi.toDouble()-yenisayi.toDouble()
            }
        }
        sayiGoster.setText(sonucsayisi.toString())
        yeniotp=true
    }
    fun btnsiltik(view:View){
        sayiGoster.setText("0")
        yeniotp=true
    }

    fun btnyuzdetik(view:View){
        var sayi:Double=sayiGoster.text.toString().toDouble()/100
        sayiGoster.setText(sayi.toString())
        yeniotp=true
    }
}