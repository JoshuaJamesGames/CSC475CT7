package com.example.csc475ct7

import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val etFarenheit: EditText = findViewById(R.id.etFarenheit)
        val etCelcius: EditText = findViewById(R.id.etCelcius)

        fun convertTemp(farenheit: Float?, celcius: Float?){
            if(farenheit !=null || celcius!=null) {
                var calculationTemp: Float = 0F

                if (farenheit != null) {
                    calculationTemp = ConvertUtil.farenheitToCelcius(farenheit)
                    etCelcius.setText(calculationTemp.toString())
                } else {
                    if (celcius != null) {
                        calculationTemp = ConvertUtil.celciusToFarenHeit(celcius)
                        etFarenheit.setText(calculationTemp.toString())
                    }
                }
            }
        }

        val etPounds: EditText = findViewById(R.id.etPounds)
        val etKilograms: EditText = findViewById(R.id.etKilograms)

        fun convertWeight(pounds: Float?, kilograms: Float?){
            if(pounds !=null || kilograms!=null) {
                var calculationTemp: Float = 0F

                if (pounds != null) {
                    calculationTemp = ConvertUtil.poundsToKilograms(pounds)
                    etKilograms.setText(calculationTemp.toString())
                } else {
                    if (kilograms != null) {
                        calculationTemp = ConvertUtil.kilogramsToPounds(kilograms)
                        etPounds.setText(calculationTemp.toString())
                    }
                }
            }
        }

        val etMiles: EditText = findViewById(R.id.etMiles)
        val etKilometers: EditText = findViewById(R.id.etKilometers)
        fun convertDistance(miles: Float?, kilometers: Float?){
            if(miles !=null || kilometers!=null) {
                var calculationTemp: Float = 0F

                if (miles != null) {
                    calculationTemp = ConvertUtil.milesToKilometers(miles)
                    etKilometers.setText(calculationTemp.toString())
                } else {
                    if (kilometers != null) {
                        calculationTemp = ConvertUtil.kilometersToMiles(kilometers)
                        etMiles.setText(calculationTemp.toString())
                    }
                }
            }
        }

        val etGallons: EditText = findViewById(R.id.etGallons)
        val etLiters: EditText = findViewById(R.id.etLiters)
        fun convertVolume(gallons: Float?, liters: Float?){
            if(gallons !=null || liters!=null) {
                var calculationTemp: Float = 0F

                if (gallons != null) {
                    calculationTemp = ConvertUtil.gallonsToLiters(gallons)
                    etLiters.setText(calculationTemp.toString())
                } else {
                    if (liters != null) {
                        calculationTemp = ConvertUtil.litersToGallons(liters)
                        etGallons.setText(calculationTemp.toString())
                    }
                }
            }
        }

        val etAcres: EditText = findViewById(R.id.etAcres)
        val etSquareFeet: EditText = findViewById(R.id.etSquareFeet)
        fun convertArea(acres: Float?, squareFeet: Float?){
            if(acres !=null || squareFeet!=null) {
                var calculationTemp: Float = 0F

                if (acres != null) {
                    calculationTemp = ConvertUtil.acresToSquareFeet(acres)
                    etSquareFeet.setText(calculationTemp.toString())
                } else {
                    if (squareFeet != null) {
                        calculationTemp = ConvertUtil.squareFeetToAcres(squareFeet)
                        etAcres.setText(calculationTemp.toString())
                    }
                }
            }
        }

        val etDogYears: EditText = findViewById(R.id.etDogYears)
        val etHumanYears: EditText = findViewById(R.id.etHumanYears)
        fun convertAge(dogYears: Float?, humanYears: Float?){
            if(dogYears !=null || humanYears!=null) {
                var calculationTemp: Float = 0F

                if (dogYears != null) {

                    calculationTemp = ConvertUtil.dogYearsToHumanYears(dogYears)
                    etHumanYears.setText(calculationTemp.toString())
                } else {
                    if (humanYears != null) {

                        calculationTemp = ConvertUtil.humanYearsToDogYears(humanYears)
                        etDogYears.setText(calculationTemp.toString())
                    }
                }
            }
        }
        val btnConvert: ImageButton = findViewById(R.id.imageButton)

        btnConvert.setOnClickListener{

            convertTemp(etFarenheit.text.toString().toFloatOrNull(),etCelcius.text.toString().toFloatOrNull())
            convertWeight(etPounds.text.toString().toFloatOrNull(), etKilograms.text.toString().toFloatOrNull())
            convertDistance(etMiles.text.toString().toFloatOrNull(), etKilometers.text.toString().toFloatOrNull())
            convertVolume(etGallons.text.toString().toFloatOrNull(), etLiters.text.toString().toFloatOrNull())
            convertArea(etAcres.text.toString().toFloatOrNull(), etSquareFeet.text.toString().toFloatOrNull())
            convertAge(etDogYears.text.toString().toFloatOrNull(), etHumanYears.text.toString().toFloatOrNull())
        }

    }
}